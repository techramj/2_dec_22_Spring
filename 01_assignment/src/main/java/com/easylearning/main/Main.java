package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.entity.Employee;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Employee emp = context.getBean("emp", Employee.class);
		Employee emp1 = context.getBean("emp1", Employee.class);
		Employee emp2 = context.getBean("emp2", Employee.class);
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		
	}
	
	public static void example1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
		Employee empWithbike = context.getBean("empWithBike", Employee.class);
		Employee empWithCar = context.getBean("empWithCar", Employee.class);
		Employee empWithJeep = context.getBean("empWithJeep", Employee.class);
		
		System.out.println(empWithbike);
		System.out.println(empWithCar);
		System.out.println(empWithJeep);
	}

}
