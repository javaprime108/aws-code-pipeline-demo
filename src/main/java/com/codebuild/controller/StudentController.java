package com.codebuild.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codebuild.model.Student;
import com.codebuild.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping(value = "/stu")
	public ResponseEntity<?> getStudent() {
		try {
			List<Student> studentDetail = studentService.studentDetail();
			return ResponseEntity.status(HttpStatus.OK).body(studentDetail);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		}

	}
}
