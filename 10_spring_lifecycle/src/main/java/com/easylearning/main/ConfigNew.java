package com.easylearning.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.easylearning.entity.Ticket;
import com.easylearning.entity.TicketVendorMachine;

@Configuration
public class ConfigNew {
	
	@Scope("prototype")
	@Bean
	public Ticket ticket() {
		return  new Ticket();
	}
	
	@Bean
	public TicketVendorMachine machine() {
		return new TicketVendorMachine() {
			@Override
			public Ticket getTicket() {
				return ticket();
			}
		};
	}
}
