package com.genpact.model;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "book_details")
public class Book {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "book_name")
	private String book_name;
	
	@Column(name = "author_name")
	private String author_name;
	
	@Column(name = "book_category")
	private String book_category;
	
	@Column(name = "purchase_date")
	private java.sql.Timestamp purchase_date;
	
	@Column(name = "is_approved")
	private boolean is_approved;
	
	@Column(name= "approved_by")
	private int approved_by;
	
	@Column(name= "approved_date")
	private java.sql.Timestamp approved_date;
	
	
	public Book() {
		
	}


	public Book(String book_name, String author_name, String book_category, Timestamp purchase_date,
					int approved_by, Timestamp approved_date) {
		//super();
		this.book_name = book_name;
		this.author_name = author_name;
		this.book_category = book_category;
		this.purchase_date = purchase_date;
		this.is_approved = false;
		this.approved_by = approved_by;
		this.approved_date = approved_date;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	public String getBook_name() {
		return book_name;
	}


	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}


	public String getAuthor_name() {
		return author_name;
	}


	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}


	public String getBook_category() {
		return book_category;
	}


	public void setBook_category(String book_category) {
		this.book_category = book_category;
	}


	public java.sql.Timestamp getPurchase_date() {
		return purchase_date;
	}


	public void setPurchase_date(java.sql.Timestamp purchase_date) {
		this.purchase_date = purchase_date;
	}


	public boolean isIs_approved() {
		return is_approved;
	}


	public void setIs_approved(boolean is_approved) {
		this.is_approved = is_approved;
	}


	public int getApproved_by() {
		return approved_by;
	}


	public void setApproved_by(int approved_by) {
		this.approved_by = approved_by;
	}


	public java.sql.Timestamp getApproved_date() {
		return approved_date;
	}


	public void setApproved_date(java.sql.Timestamp approved_date) {
		this.approved_date = approved_date;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", book_name=" + book_name + ", author_name=" + author_name + ", book_category="
				+ book_category + ", purchase_date=" + purchase_date + ", is_approved=" + is_approved + ", approved_by="
				+ approved_by + ", approved_date=" + approved_date + "]";
	}



	
//	
//	public Book(String bookname, String bookauthor, String bookcategory, Date publishyear, Date purchasedate) {
//		
//		this.bookname = bookname;
//		this.bookauthor = bookauthor;
//		this.bookcategory = bookcategory;
//		this.publishyear = publishyear;
//		this.purchasedate = purchasedate;
//		this.isApproved = false;
//	}


}
