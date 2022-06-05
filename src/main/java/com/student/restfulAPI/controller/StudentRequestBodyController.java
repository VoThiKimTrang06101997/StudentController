package com.student.restfulAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.restfulAPI.model.Student;

@RestController
@RequestMapping("/student/requestbody")

public class StudentRequestBodyController {
	private List<Student> listStudent = new ArrayList<Student>();
	
	@PostMapping(value = "/add", consumes ="application/json")
	public ResponseEntity<List<Student>> addStudentRequestBody(@RequestBody Student student) {
		listStudent.add(student);
		return new ResponseEntity<List<Student>>(listStudent, HttpStatus.OK);
		
	}
	
}
