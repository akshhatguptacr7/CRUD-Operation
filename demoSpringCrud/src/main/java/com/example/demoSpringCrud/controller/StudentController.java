package com.example.demoSpringCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoSpringCrud.Repository.StudentRepository;
import com.example.demoSpringCrud.model.Student;
import com.example.demoSpringCrud.service.StudentService;

@RequestMapping("/student")
@RestController
public class StudentController {
	@Autowired
	private StudentService service;
	
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student s) {
	return	service.addstudent(s) ;
	}

	@GetMapping("/get")
	public List<Student> getStudent() {
		return service.getstudent();
	}
	
	@PutMapping("/update/{id}")
	public Student update(@PathVariable("id") int id, @RequestBody Student s) {
		return service.updatestudent(id,s);
	}
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int id) {
		service.deletestudent(id);
	}
	
}