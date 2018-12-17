package com.genpact.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.genpact.dao.Book_dao;
import com.genpact.model.Book;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class BookController {
	
	@Autowired
	private Book_dao book_dao;
	
	@GetMapping("/books")
	public List<Book> getAllBooks() {
		
		List<Book> book = book_dao.getAllBooks();
		return book;
	}
	
	@PostMapping(value = "/books/create")
	public Book postBook(@RequestBody Book book) {
		Book _book = book_dao.addBook(book);
		return _book;
	} 
	
	@DeleteMapping("/books/{id}")
	public ResponseEntity<String> deleteBook(@PathVariable("id") int id) {
		System.out.println("Delete Book with ID = " + id + "...");

		book_dao.deleteBook(id);

		return new ResponseEntity<>("Book has been deleted!", HttpStatus.OK);
	}
	
	@DeleteMapping("/books/delete")
	public ResponseEntity<String> deleteAllbooks(Book delete) {
		System.out.println("Delete All books...");

		book_dao.deleteAllBook(delete);

		return new ResponseEntity<>("All books have been deleted!", HttpStatus.OK);
	}
	
//	@GetMapping(value = "books/search/{book_name}")
//	public List<Book> searchBook(@PathVariable String book) {
//
//		List<Book> books = book_dao.searchBook(book);
//		
//		return books;
//	}
	
	@PutMapping("/bookname/{id}")
	public ResponseEntity<Book> updateBook(@PathVariable("id") int id, @RequestBody Book book) {
		System.out.println("Update Book with ID = " + id + "...");

		ResponseEntity<Book> _book = book_dao.updateBook(id, book);
		
		return _book;
	}

}
