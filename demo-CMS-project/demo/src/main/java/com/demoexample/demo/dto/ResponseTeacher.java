package com.demoexample.demo.dto;

public class ResponseTeacher {
    private long id;
    private String name;
    private String qualification;
    private String exp;

    public Long getId() {
        return id;
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

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }
}
