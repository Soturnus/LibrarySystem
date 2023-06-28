package com.soturno.librarySystem.repository;

import com.soturno.librarySystem.entity.Periodical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeriodicalRepository extends JpaRepository<Periodical, Long> {
}
