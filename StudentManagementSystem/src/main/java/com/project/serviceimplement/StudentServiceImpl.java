package com.project.serviceimplement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StudentRepository;
import com.project.entity.Student;
import com.project.service.StudentInterface;


@Service
public class StudentServiceImpl implements StudentInterface{

	@Autowired
	private StudentRepository studentRepo;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student); //Same for Update method
	}

	@Override
	public List<Student> findAllStudents() {
		// To return list casting is needed
		return (List<Student>) studentRepo.findAll();
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentRepo.deleteById(id);
		
	}

}
