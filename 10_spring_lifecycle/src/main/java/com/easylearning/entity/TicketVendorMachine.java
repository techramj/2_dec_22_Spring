package com.easylearning.entity;

public abstract class TicketVendorMachine{
	private Ticket ticket;
	
	public TicketVendorMachine() {
		// TODO Auto-generated constructor stub
	}
	
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	
	public abstract Ticket getTicket();

	@Override
	public String toString() {
		return "TicketVendorMachine []";
	}
	
	
}
