package com.project.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.entity.Student;



@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
