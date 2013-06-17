package ua.be.dc.services.sellingService.models;

import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Ticket;

public class OrderDetail {

	private String name;
	private TicketDetails[] ticketsDetails;
	private Float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return ticketsDetails.length;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public TicketDetails[] getTicketsDetails() {
		return ticketsDetails;
	}

	public void setTicketsDetails(Ticket[] tickets) throws InvalidTicketException {
		if (tickets.length > 0) {
			name = "Tickets for " + tickets[0].getEvent().getName();
		}
		
		price = 0f;
		ticketsDetails = new TicketDetails[tickets.length];
		for (int i = 0; i < tickets.length; ++i) {
			TicketDetails ticketDetails = new TicketDetails(tickets[i]);
			price += tickets[i].getPrice(); 
			ticketsDetails[i] = ticketDetails;
		}
	}

}
