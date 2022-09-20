package com.example.demoSpringCrud.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demoSpringCrud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	

}
