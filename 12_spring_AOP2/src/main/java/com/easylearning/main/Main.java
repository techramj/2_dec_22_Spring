package com.easylearning.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.easylearning.service.LoanService;

//@Configuration
//@EnableAspectJAutoProxy
public class Main {

	public static void main(String... args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		LoanService service = (LoanService)context.getBean("loanService");
		service.issueLoan("Jack123");
		
		System.out.println();
		
		try {
		service.payDue("Jack123");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
