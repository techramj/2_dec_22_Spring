package com.easylearning.main;

public class Single {
	
	private  final static Single instance = new Single();
	
	static {
		System.out.println("static block called...");
	}
	
	private Single() {
		System.out.println("single object created....");
	}
	
	public static Single getInstance() {
		return instance;
	}

}
