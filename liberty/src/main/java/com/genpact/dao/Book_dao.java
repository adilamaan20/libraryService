package com.genpact.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.genpact.model.Book;


public interface Book_dao {
	
	public Book addBook(Book book);
	
	//public List<Book> findByBookauthor(String author_name);
	
	public ResponseEntity<Book> updateBook(Integer id, Book book);
	
	public String deleteBook(Integer id);
	
	public Book deleteAllBook(Book delete);
			
	public List<Book> getAllBooks();

	//public List<Book> searchBook(String book);
}

