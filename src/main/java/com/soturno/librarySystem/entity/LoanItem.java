package com.soturno.librarySystem.entity;


import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_loan_items")
public class LoanItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date returnDate;

	@ManyToOne
	@JoinColumn(name = "id_loan")
    private Loan loan;

	@ManyToOne
	@JoinColumn(name = "id_book")
    private Book book;
	
	@ManyToOne
	@JoinColumn(name = "id_periodical")
    private Periodical periodical;

}