package ua.be.dc.services.ticketService.cli;

import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.service.TicketService;

public interface ITicketServiceCLI extends TicketService {

	public void createEvent(Event event);
}
