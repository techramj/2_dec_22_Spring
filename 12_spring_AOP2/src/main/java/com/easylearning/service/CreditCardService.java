package com.easylearning.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class CreditCardService {

	public void issueCreditCard(String customerId) {

		System.out.println("card issued to customer: " + customerId);
	}

	public void blockCreditCard(String customerId) {
		System.out.println("Blocked creditCard for customer: " + customerId);
	}

	public boolean payDue(String customerId) throws Throwable {

		System.out.println("Pay credit card due for: " + customerId);
		if(1== 1) {
			throw new RuntimeException("Force exception for testing!!!");
		}
		return false;

	}

}
