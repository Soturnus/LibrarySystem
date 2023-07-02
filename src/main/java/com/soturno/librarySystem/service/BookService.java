package com.soturno.librarySystem.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soturno.librarySystem.entity.Book;
import com.soturno.librarySystem.entity.dto.BookDTO;
import com.soturno.librarySystem.repository.BookRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class BookService {
	
	private static Logger logger = LoggerFactory.getLogger(BookService.class);

	@Autowired
	private BookRepository bookRepository;

	public Book getBookByName(String name) throws Exception {

        if( name == null ) {
        	logger.info("Name {} is null");

            throw new Exception("Name cannot be empty");
        }

        return null;
	}

	public List<Book> getAllBooksByName(String name) throws Exception {

		if( name == null ) {
        	logger.info("Name {} is null");

			throw new Exception("Name cannot be empty");
		}

		return bookRepository.findByName(name);
	}

	@SuppressWarnings("deprecation")
	public Book updateBook(Long id, BookDTO dto) {
		
		try {
			Book book = bookRepository.getById(id);
			updateBook(book, dto);
			bookRepository.save(book);
			
			logger.info("Book with id {} updated successfuly", id);

			return book;
		} catch(EntityNotFoundException e) {
			logger.info("Error => {}", e.getMessage());

			throw new EntityNotFoundException("Book not found");
		} 
	}
	
	private void updateBook(Book book, BookDTO dto) {
		book.setName(dto.getName());
		book.setSubject(dto.getSubject());
		book.setTumble(dto.getTumble());
		book.setStatus(dto.getStatus());
		book.setAuthor(dto.getAuthor());
	}

}