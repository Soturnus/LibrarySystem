package com.soturno.librarySystem.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.soturno.librarySystem.entity.Book;
import com.soturno.librarySystem.entity.dto.BookDTO;
import com.soturno.librarySystem.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	private static Logger logger = LoggerFactory.getLogger(BookController.class);
	
	@Autowired
	BookService bookService;
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateBook(@PathVariable Long id, @RequestBody BookDTO dto) {

		Book book = bookService.updateBook(id, dto);
		
		logger.info("UPDATE NO CONTROLLER");
		
		return new ResponseEntity<>(book, HttpStatus.OK);	
	}

}
