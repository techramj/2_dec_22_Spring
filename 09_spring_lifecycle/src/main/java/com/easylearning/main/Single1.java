package com.easylearning.main;

public class Single1 {

	private static Single1 instance;

	static {
		System.out.println("single1 static block called...");
	}

	private Single1() {
		System.out.println("single1 constructor called");
	}

	public static Single1 getInstance() {
		if (instance == null) {
			instance = new Single1();
		}
		return instance;
	}

}
