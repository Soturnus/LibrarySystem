package com.soturno.librarySystem.repository;

import com.soturno.librarySystem.entity.BookPublisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPublisherRepository extends JpaRepository<BookPublisher, Long> {
}
