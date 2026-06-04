package com.demoexample.demo.service;

import com.demoexample.demo.dto.StudentRequest;
import com.demoexample.demo.dto.SubjectDto;
import com.demoexample.demo.model.Student;
import com.demoexample.demo.model.Subject;
import com.demoexample.demo.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class StudentServiceImp implements StudentService {
    private final StudentRepo studentRepo ;

    public StudentServiceImp(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


    @Override
    public Student createStudent(StudentRequest studentRequest) {
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setAge(studentRequest.getAge());
        student.setSemester(studentRequest.getSemester());
        student.setEmail(studentRequest.getEmail());
        student.setPassword(studentRequest.getPassword());

        if (studentRequest.getSubject() != null && !studentRequest.getSubject().isEmpty()) {

            Set<Subject> subjects = new HashSet<>();

            for (SubjectDto dto : studentRequest.getSubject()) {
                Subject subject = new Subject();
                subject.setSubject_name(dto.getSubject_name());
                subject.setSubject_credits(dto.getSubject_credits());

                subject.setStudent(student);

                subjects.add(subject);
            }

            student.setSubject(subjects);
        }

        return studentRepo.save(student);

    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    @Override
    public Student getStudentByID(Long id) {
        return studentRepo.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(Long id, StudentRequest studentRequest) {
        return studentRepo.findById(id)
                .map(existingStudent -> {
                    existingStudent.setName(studentRequest.getName());
                    existingStudent.setAge(studentRequest.getAge());
                    existingStudent.setPassword(studentRequest.getPassword());
                    existingStudent.setEmail(studentRequest.getEmail());


                    return studentRepo.save(existingStudent);
                })
                .orElse(null);
    }

    @Override
    public boolean deleteStudent(Long id) {
        if(studentRepo.existsById(id)){
            studentRepo.deleteById(id);
            return true;
        }
        return false;
    }

//    @Override
//    public Student deleteAll() {
//        studentRepo.deleteAll();
//        return null;
//    }
}