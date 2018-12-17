package com.genpact.daoImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.genpact.dao.Book_dao;
import com.genpact.model.Book;
import com.genpact.repository.BookRepository;
@Service
public class BookImplementation implements Book_dao {
	
	@Autowired
	BookRepository repository;

	@Override
	public Book addBook(Book book) {
		Book _book = repository.save(new Book(book.getBook_name(),book.getAuthor_name(),book.getBook_category(),book.getPurchase_date(),
				book.getApproved_by(),book.getApproved_date()));
		return _book;
	}

//	@Override
//	public List<Book> findByBookauthor(String author_name) {
//		List<Book> books = repository.findByBookauthor(author_name);
//		return books;
//	}

	@Override
	public ResponseEntity<Book> updateBook(Integer id, Book book) {
		Optional<Book> userData = repository.findById(id);

		if (userData.isPresent()) {
			Book _book = userData.get();
			_book.setBook_name(book.getBook_name());
			_book.setAuthor_name(book.getAuthor_name());
			_book.setBook_category(book.getBook_category());
			_book.setPurchase_date(book.getPurchase_date());
			_book.setApproved_by(book.getApproved_by());
			_book.setApproved_date(book.getApproved_date());
			return new ResponseEntity<>(repository.save(_book), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@Override
	public String deleteBook(Integer id) {
		repository.deleteById(id);
		return "Success";
	}

	@Override
	public Book deleteAllBook(Book delete) {
		repository.deleteAll();
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> book = new ArrayList<>();
		repository.findAll().forEach(book::add);
		return book;
	}

//	@Override
//	public List<Book> searchBook(String book) {
//		List<Book> book1 = new ArrayList<>();
//		repository.bookSearch(book);
//		return book1;
//	}

}
