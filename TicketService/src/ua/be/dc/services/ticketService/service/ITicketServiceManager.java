package ua.be.dc.services.ticketService.service;

import ua.be.dc.services.ticketService.models.Event;

public interface ITicketServiceManager extends TicketService {

	public void createEvent(Event event);
	
	public void deleteEventById(Integer eventId);
}
