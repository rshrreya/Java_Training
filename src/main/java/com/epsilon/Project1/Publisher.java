package com.epsilon.Project1;

public class Publisher {
	
	int publisherId;
	String name;
	String location;
	
	public Publisher(int publisherId, String name, String location) {
		super();
		this.publisherId = publisherId;
		this.name = name;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Publisher [publisherId=" + publisherId + ", name=" + name + ", location=" + location + "]";
	}	

}
