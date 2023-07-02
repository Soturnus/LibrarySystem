package com.soturno.librarySystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soturno.librarySystem.entity.BookPublisher;
import com.soturno.librarySystem.repository.BookPublisherRepository;

@Service
public class BookPublisherService {
	
	@Autowired
	private BookPublisherRepository bookPublisherRepository;
	
	public List<BookPublisher> getBookPublishers(String name) throws Exception {

		if( name == null ) {
			throw new Exception("Name cannot be empty");
		}

		return bookPublisherRepository.findByName(name);
	}
}
