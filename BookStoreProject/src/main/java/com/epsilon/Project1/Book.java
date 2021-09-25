package com.epsilon.Project1;

public class Book {
	
	int bookId;
	String bookName;
	String language;
	int authorId;
	int publisherId;
	double price;
	
	public Book(int bookId, String bookName, String language, int authorId, int publisherId, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.language = language;
		this.authorId = authorId;
		this.publisherId = publisherId;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", language=" + language + ", authorId=" + authorId
				+ ", publisherId=" + publisherId + ", price=" + price + "]";
	}
	
}
