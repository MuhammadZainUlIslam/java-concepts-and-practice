package com.demoexample.demo.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class RequestTeacher {
    @NotEmpty(message = "Name Can't Be Empty...!")
    private String name;
    @NotEmpty(message = "Qualification Can't Be Empty...!")
    @Pattern(regexp = "^Fsc|BS|MS|Phd|$",message = "Chose Anyone Of These -|Fsc|BS|MS|Phd|-")
    private String qualification;
    @NotEmpty(message = "Experience Can't Be Empty Or Null..!")
    @Size(min = 1, message = "Experience Should be At least One Year")
    private String exp;



    public void setName(String name) {
        this.name = name;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getName() {
        return name;
    }

    public String getQualification() {
        return qualification;
    }

    public String getExp() {
        return exp;
    }
}