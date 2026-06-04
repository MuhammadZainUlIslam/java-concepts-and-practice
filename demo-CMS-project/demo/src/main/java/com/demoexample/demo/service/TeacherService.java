package com.demoexample.demo.service;

import com.demoexample.demo.dto.RequestTeacher;
import com.demoexample.demo.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher addTeacher(RequestTeacher requestteacher);
    boolean removeTeacher(Long id);
    List<Teacher> displayTeachers();
    Teacher getTecherByID (Long id);
    Teacher updateTeacher(Long id, RequestTeacher requestTeacher);

}
