package com.demoexample.demo.controller;

import com.demoexample.demo.dto.DepartmentDto;
import com.demoexample.demo.model.Department;
import com.demoexample.demo.service.DepartmentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

   private final DepartmentService departmentService;

   public DepartmentController(DepartmentService departmentService){
       this.departmentService = departmentService;
   }


    @PostMapping
    public ResponseEntity<Department> create(@Valid @RequestBody DepartmentDto requestDepartment){
        Department departement = departmentService.createDepartment(requestDepartment);
        URI location = URI.create("/departments"+ departement.getDepartment_id());
        return ResponseEntity.created(location).body(departement);
    }

    @PutMapping("/{id}")
    public Department update(@Valid @PathVariable Long id, @RequestBody DepartmentDto request){
       return departmentService.updateDepartmentById(id, request);
    }
    @GetMapping()
    public List<Department> findALL(){
       return departmentService.displayAllDepartments();

    }

    @GetMapping("/{id}")
    public Department findByID(@PathVariable Long id){
       return departmentService.displayDepartmentByID(id);
    }
    @DeleteMapping("/{id}")
    public String deleteByID(@PathVariable Long id){
       boolean deleted = departmentService.deleteDepartmentById(id);
       return deleted ? "Deleted Successfully":"Does Not Exists";
    }

}
