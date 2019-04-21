package com.suraj.spring.beans;

public class Book {

	private Integer bookId;
	private String bookName;
	
	public Integer getBookId() {
		return bookId;
	}
	
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	
	public String getBookName() {
		return bookName;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public void tearUp() throws Exception {
		System.out.println("Before book issued get authrized by Librarian...");
	}
	
	public void tearDown() throws Exception {
		System.out.println("book deposited to Library after reading the book...");
	}
}
