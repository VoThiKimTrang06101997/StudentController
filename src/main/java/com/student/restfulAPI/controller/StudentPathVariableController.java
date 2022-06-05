package com.student.restfulAPI.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.restfulAPI.model.Student;

@RestController
@RequestMapping("student/vari")
public class StudentPathVariableController {
	private List<Student> listStudent = new ArrayList<Student>();
	
	@PostMapping("/add/{name}/{age}")
	public ResponseEntity<List<Student>> addStudentPathVariable(@PathVariable("name") String name, @PathVariable("age") int age) {
		Student student = new Student();
		student.setName(name);
		student.setAge(age);
		
		listStudent.add(student);
		
		return new ResponseEntity<List<Student>>(listStudent, HttpStatus.OK);
		
	}
	
}
