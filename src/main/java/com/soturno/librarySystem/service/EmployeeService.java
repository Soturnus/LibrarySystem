package com.soturno.librarySystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soturno.librarySystem.entity.Employee;
import com.soturno.librarySystem.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getEmployees(String name) throws Exception{

		if( name == null ) {
			throw new Exception("Name cannot be empty");
		}

		return employeeRepository.findByName(name);
	}
}
