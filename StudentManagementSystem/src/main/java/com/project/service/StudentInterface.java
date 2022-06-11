package com.project.service;

import java.util.List;

import com.project.entity.Student;


public interface StudentInterface {

	//To save New Student
	
	public Student saveStudent(Student student);
	
	//To update Student
	
	public Student updateStudent(Student student);
	
	
	//To fetch all records from DB
	public List<Student> findAllStudents();
	
	//To delete Student
	
	public void deleteStudent(int id);
	
	
	
}
