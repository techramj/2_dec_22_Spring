package com.easylearning.main;

public class Test {
	
	public static void main(String[] args) {

		try {
			Class.forName("com.easylearning.main.Single1");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Single1 ob1 = Single1.getInstance(); 
		Single1 ob2 = Single1.getInstance(); 
		System.out.println(ob1==ob2);

	}
	
	public static void test2() {

		try {
			Class.forName("com.easylearning.main.Single");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void test1() {
		Single ob1 = Single.getInstance();
		Single ob2 = Single.getInstance();
		
		System.out.println(ob1);
		System.out.println(ob2);
	}

}
