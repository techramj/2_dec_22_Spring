package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.entity.Address;
import com.easylearning.entity.Employee;
import com.easylearning.entity.Street;

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
		System.out.println("Main start");
		ApplicationContext context = getApplicationContext("spring.xml");
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println(emp1);
		
		Address address = context.getBean("address", Address.class);
		System.out.println(address);
		
		Street street = context.getBean("street", Street.class);
		System.out.println(street);

	}
	
	public static void delay(int timeInSecond) {
		try {
			Thread.sleep(timeInSecond*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
