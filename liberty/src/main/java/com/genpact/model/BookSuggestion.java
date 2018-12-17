package com.genpact.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "suggested_book")
public class BookSuggestion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "bookname")
	private String bookname;
	@Column(name = "bookauthor")
	private String bookauthor;
	@Column(name = "bookcategory")
	private String bookcategory;
	@Column(name = "publishyear")
	private java.sql.Date publishyear;
	@Column(name = "purchasedate")
	private java.sql.Date purchasedate;
	
	public BookSuggestion() {
		
	}

	public BookSuggestion(String bookname, String bookauthor, String bookcategory, Date publishyear,Date purchasedate) {
		
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookcategory = bookcategory;
		this.publishyear = publishyear;
		this.purchasedate = purchasedate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getBookauthor() {
		return bookauthor;
	}

	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}

	public String getBookcategory() {
		return bookcategory;
	}

	public void setBookcategory(String bookcategory) {
		this.bookcategory = bookcategory;
	}

	public java.sql.Date getPublishyear() {
		return publishyear;
	}

	public void setPublishyear(java.sql.Date publishyear) {
		this.publishyear = publishyear;
	}

	public java.sql.Date getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(java.sql.Date purchasedate) {
		this.purchasedate = purchasedate;
	}

	@Override
	public String toString() {
		return "BookSuggestion [id=" + id + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookcategory="
				+ bookcategory + ", publishyear=" + publishyear + ", purchasedate=" + purchasedate + "]";
	}

	
	
}
