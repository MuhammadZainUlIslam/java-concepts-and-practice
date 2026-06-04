package com.demoexample.demo.controller;


import com.demoexample.demo.dto.StudentRequest;
import com.demoexample.demo.model.Student;
import com.demoexample.demo.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController( StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<Student> create(@Valid @RequestBody StudentRequest request) {
        Student student = studentService.createStudent(request);
        URI location = URI.create("/students/" + student.getId());
        return ResponseEntity.created(location).body(student);
    }

    @GetMapping
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getByID(@PathVariable Long id) {
        return studentService.getStudentByID(id);
    }


    @PutMapping ("/{id}")
    public Student update(@Valid @PathVariable Long id, @RequestBody StudentRequest request) {
        return studentService.updateStudent(id, request);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        boolean deleted = studentService.deleteStudent(id);
        return deleted ? "Deleted successfully" : "Student not found";
    }

//    @DeleteMapping()
//    public Student deleteAll(){
//        return studentService.deleteAll();
//    }


}
