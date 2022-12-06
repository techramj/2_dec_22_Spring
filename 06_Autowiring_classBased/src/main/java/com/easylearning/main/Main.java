package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.entity.Address;
import com.easylearning.entity.Employee;

public class Main {


	public static ApplicationContext getApplicationContext(String filename) {
		ApplicationContext context = new ClassPathXmlApplicationContext(filename);
		return context;
	}
	
	public static ApplicationContext getApplicationContext(Class clazz) {
		ApplicationContext context = new AnnotationConfigApplicationContext(clazz);
		return context;
	}
	

	public static void main(String[] args) {
		
		ApplicationContext context = getApplicationContext(Config.class);
		
		Address address = context.getBean("address", Address.class);
		System.out.println(address);
		
		Address address1 = context.getBean("address1", Address.class);
		System.out.println(address1);
		
		
		
		
		
		
		System.out.println("Main end....");
	}
	
	public static void delay(int timeInSecond) {
		try {
			Thread.sleep(timeInSecond*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
