package com.demoexample.demo.controller;

import com.demoexample.demo.dto.SubjectDto;
import com.demoexample.demo.model.Subject;
import com.demoexample.demo.service.SubjectService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    private final SubjectService subjectService;

    public SubjectController(SubjectService subjectService){
        this.subjectService = subjectService;

    }

    @PostMapping
    public ResponseEntity<Subject> createSubject(@Valid @RequestBody SubjectDto requestSubject){
        Subject subject = subjectService.createSubject(requestSubject);
        URI location = URI.create("/subjects" + subject.getSubject_id());
        return ResponseEntity.created(location).body(subject);
    }
    @GetMapping
    public List<Subject> displayAll(){
        return subjectService.displayAll();
    }
    @GetMapping ("/{id}")
    public Subject getByID(@PathVariable Long id){
        return subjectService.displaySubjectById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteByID(@PathVariable Long id){
        boolean deleted =  subjectService.removeSubjectById(id);
        return deleted ? "Deleted successfully" : "Student not found";
    }
    @PutMapping("/{id}")
    public Subject updateByID(@Valid @PathVariable Long id, @RequestBody SubjectDto request ){
        return subjectService.updateSubjectById(id,request);
    }

}
