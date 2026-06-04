package com.demoexample.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class SubjectDto {

    private Long subject_id;
    @NotEmpty(message = "Subject Name Can't Be Empty")
    private String subject_name;
    @Size(min = 1,max = 3,message = "Max Credits Per Subject can be 3")
    private String subject_credits;







    public String getSubject_credits() {
        return subject_credits;
    }

    public void setSubject_credits(String subject_credits) {
        this.subject_credits = subject_credits;
    }




    public Long getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(Long subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }
}
