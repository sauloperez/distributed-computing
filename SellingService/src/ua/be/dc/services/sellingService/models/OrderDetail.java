package ua.be.dc.services.sellingService.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Ticket;

public class OrderDetail {
	
	private static Logger logger = LogManager.getLogger(TicketDetails.class.getName());

	private Integer id;
	private String name;
	private TicketDetails[] ticketsDetails;
	private Float price;
	private Order order;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		if (ticketsDetails != null) {
			return ticketsDetails.length;
		}
		return 0;
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
		price = 0f;
		ticketsDetails = new TicketDetails[tickets.length];
		for (int i = 0; i < tickets.length; ++i) {
			TicketDetails ticketDetails = new TicketDetails();
			ticketDetails.setTicket(tickets[i]);
			price += tickets[i].getPrice(); 
			ticketsDetails[i] = ticketDetails;
		}
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
