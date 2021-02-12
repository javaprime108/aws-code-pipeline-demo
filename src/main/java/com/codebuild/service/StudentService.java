package com.codebuild.service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codebuild.model.Student;
import com.codebuild.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	public List<Student> studentDetail() {
		// TODO Auto-generated method stub
		return studentRepo.studentList().stream().sorted(Comparator.comparing(Student::getId))
				.collect(Collectors.toList());
	}

}
