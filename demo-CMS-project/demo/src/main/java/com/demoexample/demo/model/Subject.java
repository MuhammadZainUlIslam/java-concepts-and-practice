package com.demoexample.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Entity
@Table(name = "Subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subject_id;
    private String subject_name;
    private String subject_credits;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @JsonIgnore
    private Student student;



    public Subject() {

    }



    //getters setters should be set below


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

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
