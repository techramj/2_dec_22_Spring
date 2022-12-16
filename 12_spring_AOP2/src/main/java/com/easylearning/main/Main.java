package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.service.LoanService;

public class Main {

	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		LoanService service = (LoanService)context.getBean("loanService");
		service.issueLoan("Jack123");
		
		System.out.println();
		
		service.payDue("Jack123");
	}

}
