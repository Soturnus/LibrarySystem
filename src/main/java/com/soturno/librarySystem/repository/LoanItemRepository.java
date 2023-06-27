package com.soturno.librarySystem.repository;

import com.soturno.librarySystem.entity.LoanItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanItemRepository extends JpaRepository<LoanItem, Long> {
}
