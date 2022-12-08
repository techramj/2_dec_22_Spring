package com.easylearning.entity;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor{
	
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessAfterInitialization called.....bean: "+bean+"    beanName="+beanName);
		if(bean instanceof Address) {
			Address address = (Address)bean;
			address.setCity(address.getCity().toUpperCase());
		}
		return bean;
	}
	
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("postProcessBeforeInitialization called.....bean: "+bean+"    beanName="+beanName);
		return bean;
	}
	

}
