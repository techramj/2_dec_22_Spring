package com.easylearning.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.easylearning.service.LogBeforeAndAfter;
import com.easylearning.service.TransactionAspect;

@ComponentScan(basePackages = {"com.easylearning"})
@Configuration
@EnableAspectJAutoProxy
public class Config {
	
	@Bean
	public LogBeforeAndAfter logBeforeAndAfter() {
		return new LogBeforeAndAfter();
	}
	
	@Bean
	public TransactionAspect transactionAspect() {
		return new TransactionAspect();
	}

}
