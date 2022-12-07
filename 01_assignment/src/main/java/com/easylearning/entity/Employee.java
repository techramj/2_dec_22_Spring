package com.easylearning.entity;

public class Employee {

	private Integer id;
	private String name;
	private Double salary;
	private Vehicle vehicle;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(Vehicle vehicle) {
		System.out.println("paramterized constructor with 1 paramter");
		this.vehicle = vehicle;
	}

	public Employee(Integer id, String name, Double salary, Vehicle vehicle) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.vehicle = vehicle;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", vehicle=" + vehicle + "]";
	}

}
