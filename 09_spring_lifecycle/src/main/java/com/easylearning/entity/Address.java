package com.easylearning.entity;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class Address implements BeanNameAware, ApplicationContextAware {

	private String city;

	public Address() {
		System.out.println("Default Address Constructor called");
	}

	public Address(String city) {
		System.out.println("Parameterized Address Constructor called");
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("setter method called...");
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}
	
	public void init() {
		System.out.println("init method called");
	}
	
	public void destroy() {
		System.out.println("destroy mehtod called");
	}

	public void setBeanName(String name) {
		System.out.println("setBeanName: "+name);
		
	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("setApplicationContext called...");
		System.out.println(new Date(applicationContext.getStartupDate()));
	}

}
