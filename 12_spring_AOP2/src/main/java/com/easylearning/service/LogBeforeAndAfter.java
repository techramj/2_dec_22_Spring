package com.easylearning.service;

import java.time.LocalDateTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogBeforeAndAfter {

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
	
	
}
