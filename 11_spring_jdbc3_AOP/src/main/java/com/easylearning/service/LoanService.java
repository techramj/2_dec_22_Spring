package com.easylearning.service;

import java.time.LocalDateTime;

public class LoanService {

	public void issueLoan(String customerId) {
		System.out.println("Entered: " + "LoanService : issueLoan at " + LocalDateTime.now());
		System.out.println("Loan Issued to customer: " + customerId);
		System.out.println("Exit: " + "LoanService : issueLoan" + LocalDateTime.now());
	}

	public void payDue(String customerId) {
		System.out.println("Entered: " + "LoanService : payDue at " + LocalDateTime.now());

		System.out.println("Begin transaction");
		try {
			System.out.println("Pending due cleared: " + customerId);
			System.out.println("Commit transaction");
		} catch (Exception e) {
			System.out.println("Rollback Transaction");
		}
		System.out.println("Exit: " + "LoanService : payDue at " + LocalDateTime.now());
	}

}
