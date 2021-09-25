package com.epsilon.Project1;

import java.util.List;

public class Order {
	
	int orderId;
	int userId;
	List <OrderItems> orderItems;
	
	public int getOrderId() {
		return orderId;
	}



	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}



	public int getUserId() {
		return userId;
	}



	public void setUserId(int userId) {
		this.userId = userId;
	}



	public List<OrderItems> getOrderItems() {
		return orderItems;
	}



	public void setOrderItems(List<OrderItems> orderItems) {
		this.orderItems = orderItems;
	}



	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", userId=" + userId + ", orderItems=" + orderItems + "]";
	}

}
