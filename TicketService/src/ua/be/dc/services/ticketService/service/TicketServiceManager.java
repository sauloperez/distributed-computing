package ua.be.dc.services.ticketService.service;

import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.models.Event;

public class TicketServiceManager implements ITicketServiceManager {
	
	private IDBEventService dbEventService;

	@Override
	public void createEvent(Event event) {
		dbEventService = new DBEventServiceImpl();
		dbEventService.insert(event);
	}

}
