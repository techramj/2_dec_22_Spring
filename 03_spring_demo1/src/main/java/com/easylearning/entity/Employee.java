package com.easylearning.entity;

public class Employee {
	private int id;
	private String name;
	private double salary;

	public Employee() {
		System.out.println("emp default constructor called!!!!");
	}

	public Employee(int id, String name, double salary) {
		System.out.println("Employee paramterized constructor called");
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
