package com.demoexample.demo.dto;

import jakarta.validation.constraints.*;

import java.util.Set;

public class StudentRequest {
    
    private Long id;
    @NotEmpty(message = "Name Can't Be Empty Or Null..!")
    private String name;
    private int age;
    @NotEmpty(message = "Email Can't Be Empty Or Null..!")
    @Email(message = "Email should be In Proper Format: eg user@gmail.com " )
    private String email;
    @NotEmpty(message = "Password Can't Be Empty")
    @Size(min = 6, message = "Password Should Be At least 6 Characters..!")
//    @Pattern(regexp = "^((?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])){4,12}$",message = "\"password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit \" ")
    private String password;
    @NotEmpty(message = "Semester Can't Be Empty")
    @Pattern(
            regexp = "^(FA|SP|SU)-\\d{4}$",
            message = "Semester must be in format FA-YYYY/SP-YYYY/SU-YYYY"
    )
    private String semester;

    private Set<SubjectDto> subject;


    public Set<SubjectDto> getSubject() {
        return subject;
    }

    public void setSubject(Set<SubjectDto> subject) {
        this.subject = subject;
    }

    /// getters and setters bellow


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }


    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public  Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
