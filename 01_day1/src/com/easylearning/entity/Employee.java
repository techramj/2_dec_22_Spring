package com.easylearning.entity;

public class Employee {
	private int id;
	private String name;
	private Vehicle vehicle;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee(int id, String name, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.vehicle = vehicle;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", vehicle=" + vehicle + "]";
	}
	
	

}
