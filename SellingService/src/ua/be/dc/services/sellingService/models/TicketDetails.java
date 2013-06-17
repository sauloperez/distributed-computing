package ua.be.dc.services.sellingService.models;

import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Ticket;

public class TicketDetails {

	private Integer id;
	private EventDetails event;
	
	public TicketDetails(Ticket ticket) throws InvalidTicketException {
		validateTicket(ticket);
		id = ticket.getId();
		event = new EventDetails(ticket.getEvent());
	}
	
	private void validateTicket(Ticket ticket) throws InvalidTicketException {
		if (ticket == null) {
			throw new InvalidTicketException("The ticket cannot be null");
		}
		if (ticket.getSold()) {
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
