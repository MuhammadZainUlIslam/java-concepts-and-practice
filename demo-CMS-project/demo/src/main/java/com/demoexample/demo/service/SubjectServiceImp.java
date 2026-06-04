package com.demoexample.demo.service;

import com.demoexample.demo.dto.SubjectDto;
import com.demoexample.demo.model.Subject;
import com.demoexample.demo.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SubjectServiceImp implements SubjectService {

    SubjectRepository subjectRepository;
   public SubjectServiceImp(SubjectRepository subjectRepository){
       this.subjectRepository = subjectRepository;
   }


    @Override
    public Subject createSubject(SubjectDto requestSubject) {
       Subject subject = new Subject();
       subject.setSubject_name(requestSubject.getSubject_name());
       subject.setSubject_credits(requestSubject.getSubject_credits());
       return subjectRepository.save(subject);

    }

    @Override
    public boolean removeSubjectById(Long id) {
        if(subjectRepository.existsById(id)){
            subjectRepository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public List<Subject> displayAll() {
       return subjectRepository.findAll();
    }

    @Override
    public Subject displaySubjectById(Long id) {
        return subjectRepository.findById(id).orElse(null);
        }

    @Override
    public Subject updateSubjectById(Long id, SubjectDto requestSubject) {
        return subjectRepository.findById(id).map(update ->{
           update.setSubject_name(requestSubject.getSubject_name());
           update.setSubject_credits(requestSubject.getSubject_credits());
           return subjectRepository.save(update);
        }).orElse(null);
    }
}
