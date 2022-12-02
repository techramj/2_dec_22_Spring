package com.easylearning.entity;

public class LandMark {
	private String name;

	public LandMark() {
		// TODO Auto-generated constructor stub
	}

	public LandMark(String name) {
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
		return "LandMark [name=" + name + "]";
	}

}
