package com.easylearning.entity;

public class Car extends Vehicle{
	
	private String name;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	
	 

}
