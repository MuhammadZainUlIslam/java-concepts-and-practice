package com.demoexample.demo.service;

import com.demoexample.demo.dto.DepartmentDto;
import com.demoexample.demo.model.Department;
import com.demoexample.demo.repository.DepartmentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DepartmentServiceImp implements DepartmentService {


    DepartmentRepository departmentRepository;

    public DepartmentServiceImp(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;

    }


    @Override
    public Department createDepartment(DepartmentDto request) {
        Department department = new Department();
        department.setDepartment_name(request.getDepartment_name());
        department.setDepartment_Score(request.getDepartment_Score());
        return departmentRepository.save(department);

    }

    @Override
    public Boolean deleteDepartmentById(Long id) {
        if (departmentRepository.existsById(id)) {
            departmentRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Department updateDepartmentById(Long id, DepartmentDto request) {
        return departmentRepository.findById(id).map(update -> {
            update.setDepartment_name(request.getDepartment_name());
            update.setDepartment_Score(request.getDepartment_Score());


            return departmentRepository.save(update);
        }).orElse(null);
    }

    @Override
    public List<Department> displayAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department displayDepartmentByID(Long id) {
        return departmentRepository.findById(id).orElse(null);
    }


}
