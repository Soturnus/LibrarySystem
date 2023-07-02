package com.soturno.librarySystem.entity.dto;

import com.soturno.librarySystem.entity.Book;
import com.soturno.librarySystem.entity.BookPublisher;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
	
	private String name;
	private String subject;
	private String tumble;
	private String status;
	private String author;

	public Book transformToDTO(BookDTO bookDTO) {
		return new Book(this.name, this.subject, this.tumble, this.status, this.author);
	}
}
