package com.easylearning.service;

import java.lang.reflect.Method;
import java.time.LocalDateTime;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAndAfter implements MethodBeforeAdvice, AfterReturningAdvice {
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Exit: " + target.getClass().getName()+ " : "+method.getName()+" at " + LocalDateTime.now());
		
	}

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Entered: " + target.getClass().getName()+ " : "+method.getName()+" at " + LocalDateTime.now());
		
	}
	

	
	

}
