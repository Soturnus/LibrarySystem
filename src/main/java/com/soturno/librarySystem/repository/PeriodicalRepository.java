package com.soturno.librarySystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soturno.librarySystem.entity.Periodical;

@Repository
public interface PeriodicalRepository extends JpaRepository<Periodical, Long> {
	List<Periodical> findByName(String name);
}
