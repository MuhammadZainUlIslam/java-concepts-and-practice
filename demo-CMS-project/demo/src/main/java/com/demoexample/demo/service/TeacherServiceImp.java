package com.demoexample.demo.service;

import com.demoexample.demo.dto.RequestTeacher;
import com.demoexample.demo.model.Teacher;
import com.demoexample.demo.repository.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class TeacherServiceImp implements TeacherService {

    private final TeacherRepository teacherRepository;
    public TeacherServiceImp(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }


    @Override
    public Teacher addTeacher(RequestTeacher requestteacher) {
        Teacher teacher = new Teacher();
        teacher.setName(requestteacher.getName());
        teacher.setQualification(requestteacher.getQualification());
        teacher.setExp(requestteacher.getExp());
       return teacherRepository.save(teacher);
    }

    @Override
    public boolean removeTeacher(Long id) {
        if(teacherRepository.existsById(id)){
            teacherRepository.deleteById(id);
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public List<Teacher> displayTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getTecherByID(Long id) {
        return teacherRepository.findById(id).orElse(null);

        }

    @Override
    public Teacher updateTeacher(Long id, RequestTeacher requestTeacher) {
        return teacherRepository.findById(id).map(update-> {
            update.setName(requestTeacher.getName());
            update.setQualification(requestTeacher.getQualification());
            update.setExp(requestTeacher.getExp());
            return teacherRepository.save(update);
        }).orElse(null);
    }
}



