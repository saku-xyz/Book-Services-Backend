package com.example.books;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class BookService {
	
	private static List<Book> books = new ArrayList<>();
	private static int bookCount = 7;
	
	static {
		
		books.add(new Book(1,"Harry Potter","J K Rowling", new Date()));
		books.add(new Book(2,"Lord Of The Ring","J R R Tolkien", new Date()));
		books.add(new Book(3,"The Hobbit","J R R Tolkien", new Date()));
		books.add(new Book(4," The Colour of Magic","Terry Pratchett", new Date()));
		books.add(new Book(5,"Assassin’s Apprentice","Robin Hobb", new Date()));
		books.add(new Book(6,"The Name of the Wind","Patrick Rothfuss", new Date()));
	}
	
	public List<Book> findAllBooks(){
		
		return books;
	
	}

	public Book addBook(Book book) {
		
		if(book.getBookId() == null) {
		
			book.setBookId(bookCount++);
			
		}
		
		books.add(book);
		return book;
		
	}
	
	public Book findBook(int id) {
		
		for(Book book: books) {
			if(book.getBookId() == id) {
				return book;
			}
		}
		
		return null;
		
	}
	
}
