package com.soturno.librarySystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soturno.librarySystem.entity.Periodical;
import com.soturno.librarySystem.repository.PeriodicalRepository;

@Service
public class PeriodicalService {

	@Autowired
	private PeriodicalRepository periodicalRepository;
	
	public List<Periodical> getEmployees(String name) throws Exception{

		if( name == null ) {
			throw new Exception("Name cannot be empty");
		}

		return periodicalRepository.findByName(name);
	}
}
