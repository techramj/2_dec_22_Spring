package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.entity.Address;

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

	public static void main(String[] args) {
		// coreJavaDemo();
		//springXmlBasedDemo();
		annotationBasedDemo();
	}

}
