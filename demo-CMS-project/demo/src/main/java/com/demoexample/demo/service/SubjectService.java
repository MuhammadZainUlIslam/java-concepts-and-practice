package com.demoexample.demo.service;

import com.demoexample.demo.dto.SubjectDto;
import com.demoexample.demo.model.Subject;

import java.util.List;

public interface SubjectService  {
    Subject createSubject(SubjectDto requestSubject);
    boolean removeSubjectById(Long id);
    List<Subject> displayAll();
    Subject displaySubjectById(Long id);
    Subject updateSubjectById(Long id, SubjectDto requestSubject);


}
