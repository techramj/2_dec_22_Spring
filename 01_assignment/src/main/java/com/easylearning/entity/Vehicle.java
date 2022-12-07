package com.easylearning.entity;

public class Vehicle {

	private String name;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void start() {
	}

	public void stop() {
	}

	@Override
	public String toString() {
		return "Vehicle [name=" + name + "]";
	}

}
