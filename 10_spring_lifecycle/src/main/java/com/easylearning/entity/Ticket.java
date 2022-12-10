package com.easylearning.entity;

public class Ticket {
	private static int ticketNoGenerator;
	private int ticketNo;

	public Ticket() {
		ticketNo = ++ticketNoGenerator;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	@Override
	public String toString() {
		return "Ticket [ticketNo=" + ticketNo + "]";
	}
	
}
