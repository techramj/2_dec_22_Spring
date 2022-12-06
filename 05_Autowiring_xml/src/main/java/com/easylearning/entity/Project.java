package com.easylearning.entity;

public class Project {

	private String name;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(String name) {
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
		return "Project [name=" + name + "]";
	}

}
