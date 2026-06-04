package com.demoexample.demo.dto;



public class StudentResponse{
    private String name;
    private long id;
    private int age;

    public String getName(){
        return name;
    }
    public Long getId(){
        return id;
    }
    public int getAge(){
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(long id){
        this.id = id;
    }
    public void setAge(int age){
        this.age = age;
    }
}

