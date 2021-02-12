package com.codebuild.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.codebuild.model.Student;

@Repository
public class StudentRepository {

	public List<Student> studentList(){
		 return Arrays.asList(
				new Student(4,"Ram","ram@gmail.com" ,"2345678923"),
				new Student(5,"Ram","ram@gmail.com" ,"2345678923"),
				new Student(1,"Ram","ram@gmail.com" ,"2345678923"),
				new Student(15,"Ram","ram@gmail.com" ,"2345678923")
				);
		
	}
}
