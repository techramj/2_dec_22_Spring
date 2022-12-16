package com.easylearning.service;

import java.time.LocalDateTime;

public class CreditCardService {
	
	public void issueCreditCard(String customerId) {
		
		System.out.println("card issued to customer: "+customerId);
	}
	
	public void blockCreditCard(String customerId) {
		System.out.println("Blocked creditCard for customer: "+customerId);
	}
	
	
	public void payDue(String customerId) {
		System.out.println("Entered: "+"CreditCardService : payDue at "+LocalDateTime.now());
		System.out.println("checking if the user has logged in!!");
		System.out.println("checking if the user has access");
		
		System.out.println("Begin transaction");
		try {
		    System.out.println("Pay credit card due for: "+customerId);
		    System.out.println("Commit transaction");
		}catch(Exception e) {
			System.out.println("Rollback Transaction");
		}
		
		System.out.println("Exit: "+"CreditCardService : payDue at "+LocalDateTime.now());
	}

}
