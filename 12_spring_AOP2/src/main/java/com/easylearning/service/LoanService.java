package com.easylearning.service;

public class LoanService {

	public void issueLoan(String customerId) {
		System.out.println("Loan Issued to customer: " + customerId);
	}

	public void payDue(String customerId) {
		System.out.println("Pending due cleared: " + customerId);
		if(1==1) {
			throw new RuntimeException("Something goes wrong!!!");
		}
	}
}
