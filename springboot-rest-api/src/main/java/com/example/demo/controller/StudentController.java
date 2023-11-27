package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Student;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	public Student student() {
		Student student=new Student(1, "Tharun", "Sai");
		return student;
		
	}

}
