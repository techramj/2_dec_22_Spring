package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.entity.Address;
import com.easylearning.entity.Employee;

public class Main {

	public static void coreJavaDemo() {
		Address address1 = new Address("Pune", "411041");

		Address address2 = new Address();
		address2.setCity("Mumbai");
		address2.setPinCode("123456");

		System.out.println(address1);
		System.out.println(address2);
	}

	public static void springXmlBasedDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Address address = (Address) context.getBean("address");
		System.out.println(address);

		Address add2 = context.getBean("address1", Address.class);
		System.out.println(add2);
	}

	public static void annotationBasedDemo() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Demo1Coniguration.class);
		Address address = context.getBean("add2", Address.class);
		System.out.println(address);
	}
	
	public static ApplicationContext getApplicationContext(String filename) {
		ApplicationContext context = new ClassPathXmlApplicationContext(filename);
		return context;
	}
	
	public static ApplicationContext getApplicationContext(Class clazz) {
		ApplicationContext context = new AnnotationConfigApplicationContext(clazz);
		return context;
	}
	
	public static void springXMlExample2() {
		ApplicationContext context = getApplicationContext("spring.xml");
		Address address = context.getBean("address", Address.class);
		Employee employee = context.getBean("employee",Employee.class);
		System.out.println(address);
		System.out.println(employee);
		
		//equality of an object
	     Address add1 = new Address("pune", "123456");
	     Address add2 = new Address("pune", "123456");
	     
	     System.out.println(add1 == add2);
	     
	     Address address1 = context.getBean("address", Address.class);
		 Employee employee1 = context.getBean("employee",Employee.class);
		 System.out.println(address1 == address);
		 System.out.println(employee == employee1);
	}
	
	public static void springXMlExample3() {
		ApplicationContext context = getApplicationContext("spring.xml");
		delay(3);
		Address add1 = context.getBean("address", Address.class);
		Address add2 = context.getBean("address", Address.class);
		System.out.println(add1 == add2);
		
		Employee emp1 = context.getBean("employee",Employee.class);
		Employee emp2 = context.getBean("employee",Employee.class);
		System.out.println(emp1==emp2);
	}
	
	public static void constructorDemo() {
		ApplicationContext context = getApplicationContext("spring.xml");
		Employee emp = context.getBean("emp1", Employee.class);
		System.out.println(emp);
		
		Employee emp2 = context.getBean("emp2", Employee.class);
		System.out.println(emp2);
	}

	public static void main(String[] args) {
		constructorDemo();
	}
	
	public static void delay(int timeInSecond) {
		try {
			Thread.sleep(timeInSecond*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
