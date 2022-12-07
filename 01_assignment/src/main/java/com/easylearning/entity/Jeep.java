package com.easylearning.entity;

public class Jeep extends Vehicle {

	public Jeep() {

	}

	public Jeep(String name) {
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
