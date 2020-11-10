package com.example.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookResource {
	
	@Autowired
	private BookService  bookservice;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		
		return bookservice.findAllBooks();
		
	}
	
	@GetMapping("/books/{bookId}")
	public Book retrieveBook(@PathVariable int bookId) {
		
		return bookservice.findBook(bookId);
		
	}
	
	@PostMapping("/books")
	public void createBook(@RequestBody Book book) {
		
		Book saveBook = bookservice.addBook(book);
		
	}
}
