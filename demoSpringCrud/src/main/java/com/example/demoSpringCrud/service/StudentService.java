package com.example.demoSpringCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demoSpringCrud.Repository.StudentRepository;
import com.example.demoSpringCrud.model.Student;

@Service
public class StudentService {

	@Autowired
	public StudentRepository sr;

	public Student addstudent(Student s) {
	return sr.save(s) ;
	}

	public List<Student> getstudent() {
		return sr.findAll();
	}

	
	public Student updatestudent(int id, Student sNew) {

		Student sOld = sr.findById(id).get();
		System.out.println(sNew.getName());
		sOld.setName(sNew.getName());
		
		return sr.save(sOld);
	}

	public void deletestudent(int id) {
			sr.deleteById(id);
	}
}
