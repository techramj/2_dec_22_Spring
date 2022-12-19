package com.easylearning.service;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Order(2)
@Aspect
public class LogBeforeAndAfter {
	
	@Pointcut("execution(* LoanService.*(..))")
	public void pointcutForLoanServiceMethod() {
	}

	@Before("execution(* LoanService.*(..))")
	public void before(JoinPoint jp) throws Throwable {
		System.out.println("Entered: " + jp.getSignature().getDeclaringTypeName() + " : " + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());

	}
	
	@AfterReturning("execution(* LoanService.*(..))")
	public void afterReturning(JoinPoint jp) throws Throwable {
		System.out.println("Exit(after returning): " + jp.getSignature().getDeclaringTypeName() + " : " + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
	}


	@After("execution(* LoanService.*(..))")
	public void after(JoinPoint jp) throws Throwable {
		System.out.println("Exit(after): " + jp.getSignature().getDeclaringTypeName() + " : " + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
	}
	
	
	@Before("execution(* CreditCardService.*(..)) && args(customerId,..)")
	public void beforeForCreditCard(JoinPoint jp, String customerId) throws Throwable {
		System.out.println("Entered: " + jp.getSignature().getDeclaringTypeName() + " : " + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
		System.out.println("customer id: "+customerId);

	}
	
	
	@AfterReturning(pointcut = "execution(* CreditCardService.payDue(..))", returning = "returnVal")
	public void afterReturning(JoinPoint jp,Boolean returnVal) {
		System.out.println("Exit: " + jp.getSignature().getDeclaringTypeName() + " : " + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
		System.out.println("Value returned: "+ returnVal);
	}
	
	@AfterThrowing(pointcut = "execution(* CreditCardService.payDue(..))", throwing = "exp")
	public void afterThrowing(JoinPoint jp, Throwable exp) {
		System.out.println("Exit: " + jp.getSignature().getDeclaringTypeName() + " : " + jp.getSignature().getName()
				+ " at " + LocalDateTime.now());
		System.out.println("excption msg: "+exp.getMessage());
	}
	
}
