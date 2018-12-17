package com.genpact.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.genpact.model.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

	//List<Book> bookSearch(String book);
}

