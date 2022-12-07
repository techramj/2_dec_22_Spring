package com.easylearning.entity;

public class Car extends Vehicle{

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String name) {
		super(name);
	}
	
	@Override
	public void start() {
		System.out.println("car start!!!!");
	}
	
	@Override
	public void stop() {
		System.out.println("car stop!!!");
	}
	
	
}
