package ua.be.dc.services.sellingService.models;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Ticket;

public class TicketDetail {
	
	private static Logger logger = LogManager.getLogger(TicketDetail.class.getName());

	private Integer id;
	private Integer ticketId;
	private EventDetail eventDetail;
	private OrderDetail orderDetail;
	
//	// Gathers the ticket detail data from a ticket
//	public void setTicket(Ticket ticket) throws InvalidTicketException {
//		validateTicket(ticket);
//		id = ticket.getId();
//		if (ticket.getEvent() != null) {
//			eventDetail = new EventDetail(ticket.getEvent());
//		}
//	}
	
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

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public EventDetail getEventDetail() {
		return eventDetail;
	}

	public void setEventDetail(EventDetail event) {
		this.eventDetail = event;
	}

	public OrderDetail getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(OrderDetail orderDetail) {
		this.orderDetail = orderDetail;
	}

}
