package com.soturno.librarySystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soturno.librarySystem.entity.BookPublisher;

@Repository
public interface BookPublisherRepository extends JpaRepository<BookPublisher, Long> {
	List<BookPublisher> findByName(String name);
}
