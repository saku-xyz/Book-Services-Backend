package com.example.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {
	
	@Autowired
	private BookService  bookservice;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		
		return bookservice.findAllBooks();
		
	}
	
	
}
