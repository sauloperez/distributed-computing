package ua.be.dc.services.ticketService.manager;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.seatAccommodation.service.Event;
import ua.be.dc.services.seatAccommodation.service.Seat;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationService;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceFactory;
import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.db.service.impl.DBTicketServiceImpl;
import ua.be.dc.services.ticketService.models.Ticket;

public class TicketServiceManager implements ITicketServiceManager {
	
	private static Logger logger = LogManager.getLogger(TicketServiceManager.class
			.getName());
	
	private IDBEventService dbEventService = new DBEventServiceImpl();
	private IDBTicketService dbTicketService = new DBTicketServiceImpl();
	private SeatAccommodationService seatAccommodationService = SeatAccommodationServiceFactory.getService();
	
	@Override
	public List<Ticket> getTickets() {
		return dbTicketService.getAll();
	}

	@Override
	public void deleteTicketById(Integer ticketId) throws Exception {
		try {
			dbTicketService.deleteById(ticketId);
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}
	
	public int test() {
		try {
			Event event = new Event();
			event.setId(1);
			Seat[] seats = seatAccommodationService.getSeatsByEvent(event);
			return seats.length;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return -1;
	}

	@Override
	public void createTicket(Ticket ticket) throws Exception {
		try {
			Event event = new Event();
			event.setId(ticket.getEvent().getId());
			event.setName(ticket.getEvent().getName());
			
			// Validate if the event exists
			ua.be.dc.services.ticketService.models.Event ticketServiceEvent = dbEventService.getById(event.getId());
			
			if (ticketServiceEvent == null) {
				throw new Exception("The event does not exist");
			}
			event.setToken(ticketServiceEvent.getToken());
			
			// Validate whether there are available seats
			Seat[] seatsSeatAccommodation = seatAccommodationService.getSeatsByEvent(event);
			if (seatsSeatAccommodation == null) {
				throw new Exception("There are no seats available for this event");
			}
			
			List<Ticket> tickets = dbTicketService.getByEventId(event.getId());
			
			// Compare the seats that the Event Venue has assigned to the event
			// with the tickets already set for it
			int seatsAvailable = seatsSeatAccommodation.length - tickets.size();
			if (seatsAvailable > 0) {
				dbTicketService.insert(ticket);
			}
			else {
				throw new Exception("There are no seats available for this event");
			}

		} catch (RemoteException e) {
			throw new Exception(e.getMessage());
		}
	}

}
