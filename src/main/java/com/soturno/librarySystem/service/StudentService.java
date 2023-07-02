package com.soturno.librarySystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soturno.librarySystem.entity.Student;
import com.soturno.librarySystem.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getEmployees(String name) throws Exception{

		if( name == null ) {
			throw new Exception("Name cannot be empty");
		}

		return studentRepository.findByName(name);
	}
}
