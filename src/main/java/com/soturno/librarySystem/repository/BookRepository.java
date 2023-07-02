package com.soturno.librarySystem.repository;

import com.soturno.librarySystem.entity.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByName(String name);

}