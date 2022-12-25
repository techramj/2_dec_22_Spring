package com.easylearning.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
@NamedQueries({ @NamedQuery(name = "all_emp", query = "select e from Employee e") })
public class Employee {

	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "name")
	private String firstName;
	private Double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer id, String firstName, Double salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", salary=" + salary + "]";
	}

}
