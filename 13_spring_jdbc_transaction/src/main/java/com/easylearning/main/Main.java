package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.easylearning.entity.Employee;
import com.easylearning.service.EmployeeService;
import com.easylearning.service.EmployeeServiceImpl;

public class Main {

	public static void main(String...args) {
		annotationBasedDemo1();
		
	}
	
	public static void annotationBasedDemo1() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Demo1Coniguration.class);
		EmployeeService service=  (EmployeeService)context.getBean("employeeService");
		Employee employee = service.getEmployee(4);
		System.out.println(employee);
		
	}
	
	public static void annotationBasedDemo() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Demo1Coniguration.class);
		EmployeeService service=  (EmployeeService)context.getBean("employeeService");
		System.out.println(service.getClass().getName());
		service.getEmployees().forEach(System.out::println);
		
		System.out.println("________________________________");
		try {
		  service.transfer(4, 5, 1000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		service.getEmployees().forEach(System.out::println);
	}
	
	
	
	
	

}
