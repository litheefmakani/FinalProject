package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Student;
import com.project.serviceimplement.StudentServiceImpl;

 
@RestController 

//We use postman so we have to use cross origin

@CrossOrigin("*")
public class StudentController {

	//To implementation of Bean class
	@Autowired
	private StudentServiceImpl studentServiceImpl;
	
	//To call save method or to save new student
	@PostMapping(value = "saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		System.out.println("Working Properly");
		studentServiceImpl.saveStudent(student);
		return student;
	}
	
	// find all students in database
	
	@GetMapping(value= "getAllStudents")
	public List<Student> findAllStudent(){
		return studentServiceImpl.findAllStudents();
	}
	
	//To update
	
	@PutMapping("updateStudent")
	public Student updateStudent(@RequestBody Student student) {
		return studentServiceImpl.updateStudent(student);
	}
	
	//To Delete
	
	@DeleteMapping("deleteStudent")
	public String deleteStudent(@RequestParam int id) {	
		studentServiceImpl.deleteStudent(id);
		return "StudentDeleted";
	}
	
}
