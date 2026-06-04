package com.demoexample.demo.controller;

import com.demoexample.demo.dto.RequestTeacher;
import com.demoexample.demo.model.Teacher;
import com.demoexample.demo.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/teachers")

@RestController
public class TeacherController {
   private final TeacherService teacherService;


    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }
    @PostMapping
    public Teacher create(@Valid @RequestBody RequestTeacher rqteacher){
        return teacherService.addTeacher(rqteacher);
    };

    @GetMapping
    public List<Teacher> getTeacher(){
        return teacherService.displayTeachers();
    }
    @PutMapping("/{id}")
    public Teacher updateTeacher(@Valid @PathVariable Long id , @RequestBody RequestTeacher rq){
        return teacherService.updateTeacher(id, rq);
    }
    @GetMapping("/{id}")
    public Teacher displayByID(@PathVariable Long id){
        return teacherService.getTecherByID(id);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id){

        boolean deleted = teacherService.removeTeacher(id);
        return deleted ? "Deleted Successfully":"Not Found";

    }

}
