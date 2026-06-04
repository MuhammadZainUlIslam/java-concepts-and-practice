package com.demoexample.demo.model;


import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

import javax.annotation.processing.Generated;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY  )
    private Long id;
    private String name;
    private String qualification;
    private String exp;

    public Teacher(){

    }


    //Add getters setters below




    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String getQualification(){
        return qualification;
    }
    public String getExp(){
        return exp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
