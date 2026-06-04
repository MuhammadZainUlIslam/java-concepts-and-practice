package com.demoexample.demo.service;

import com.demoexample.demo.dto.DepartmentDto;
import com.demoexample.demo.model.Department;

import java.util.List;

public interface DepartmentService {
    Department createDepartment(DepartmentDto request);
    Boolean deleteDepartmentById(Long id);
    Department updateDepartmentById(Long id ,DepartmentDto request );
    List<Department> displayAllDepartments();
    Department displayDepartmentByID(Long id);

}
