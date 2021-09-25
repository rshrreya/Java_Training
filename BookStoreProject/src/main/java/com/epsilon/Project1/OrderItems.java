package com.epsilon.Project1;

public class OrderItems {
	
	int id;
	int book;
	int orderId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBook() {
		return book;
	}
	public void setBook(int book) {
		this.book = book;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderItems [id=" + id + ", book=" + book + ", orderId=" + orderId + "]";
	}
	
	
	

}
