package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.service.CreditCardService;
import com.easylearning.service.LoanService;

//@Configuration
//@EnableAspectJAutoProxy
public class Main {

	public static void main(String... args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		CreditCardService cardService = context.getBean("creditCardService", CreditCardService.class);
		try {
			cardService.payDue("John");
		} catch (Throwable e) {
		}
		
		System.out.println();
		
		LoanService service = (LoanService) context.getBean("loanService");
		service.issueLoan("Jack123");
		System.out.println();

		try {
			service.payDue("Jack123");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void example1() {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		LoanService service = (LoanService) context.getBean("loanService");
		service.issueLoan("Jack123");

		System.out.println();

		try {
			service.payDue("Jack123");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
