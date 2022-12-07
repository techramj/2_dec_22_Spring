package com.easylearning.entity;

public class Bike extends Vehicle {

	public Bike() {
		// TODO Auto-generated constructor stub
	}

	public Bike(String name) {
		super(name);
	}
	
	@Override
	public void start() {
		System.out.println("bike start!!!!");
	}
	
	@Override
	public void stop() {
		System.out.println("bike stop!!!");
	}

}
