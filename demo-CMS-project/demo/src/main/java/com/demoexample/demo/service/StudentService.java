package com.demoexample.demo.service;

import com.demoexample.demo.dto.StudentRequest;
import com.demoexample.demo.model.Student;
import java.util.List;

public interface StudentService {
    Student createStudent(StudentRequest studentRequest);
    List<Student> getAllStudents();
    Student getStudentByID(Long id);
    Student updateStudent(Long id, StudentRequest studentRequest);
    boolean deleteStudent(Long id);
//    Student deleteAll();
}
