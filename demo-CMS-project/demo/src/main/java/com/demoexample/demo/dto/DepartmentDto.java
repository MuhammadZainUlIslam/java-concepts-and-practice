package com.demoexample.demo.dto;

import jakarta.validation.constraints.NotEmpty;

public class DepartmentDto {


    private Long department_id;
    @NotEmpty(message = "Department Name Can't Be Null Or Empty..!")
    private String department_name;
    @NotEmpty(message = "Department Score Can't Be Empt7 Or Null..!")
    private String department_score;


    public Long getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getDepartment_Score() {
        return department_score;
    }

    public void setDepartment_Score(String department_Score) {
        this.department_score = department_Score;
    }
}
