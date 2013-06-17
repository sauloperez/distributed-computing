package ua.be.dc.services.sellingService.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Ticket;

public class TicketDetails {
	
	private static Logger logger = LogManager.getLogger(TicketDetails.class.getName());

	private Integer id;
	private EventDetails event;
	
	public void setTicket(Ticket ticket) throws InvalidTicketException {
		validateTicket(ticket);
		id = ticket.getId();
		if (ticket.getEvent() != null) {
			event = new EventDetails(ticket.getEvent());
		}
	}
	
	private void validateTicket(Ticket ticket) throws InvalidTicketException {
		if (ticket == null) {
			throw new InvalidTicketException("The ticket cannot be null");
		}
		if (ticket.getSold() != null && ticket.getSold()) {
			throw new InvalidTicketException("Ticket already sold");
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public EventDetails getEvent() {
		return event;
	}

	public void setEvent(EventDetails event) {
		this.event = event;
	}

}
