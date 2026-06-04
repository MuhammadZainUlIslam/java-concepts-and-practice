package com.demoexample.demo.repository;

import com.demoexample.demo.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher , Long> {
}
