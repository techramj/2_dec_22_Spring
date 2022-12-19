package com.easylearning.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Aspect
public class TransactionAspect {

	@Around("execution(* LoanService.*(..))")
	public void around(ProceedingJoinPoint jp) throws Throwable{

		System.out.println("Begin transaction");
		try {
			jp.proceed();
			System.out.println("Commit transaction");
		} catch (Throwable e) {
			System.out.println("Rollback Transaction");
			throw e;
		}
	}
}
