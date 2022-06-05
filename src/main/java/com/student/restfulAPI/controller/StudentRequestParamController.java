package com.student.restfulAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.student.restfulAPI.model.Student;

@RestController
@RequestMapping("/student/param")
public class StudentRequestParamController {
private List<Student> listStudent = new ArrayList<Student>();
	
	@PostMapping("/add")
	public ResponseEntity<List<Student>> addStudentParam(@RequestParam("name") String name, @RequestParam("age") int age) {
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		
		listStudent.add(student);
		
		return new ResponseEntity<List<Student>>(listStudent, HttpStatus.OK);	
	}
}
