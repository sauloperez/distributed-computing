package ua.be.dc.services.ticketService.service;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import ua.be.dc.services.seatAccommodation.service.SeatAccommodationService;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImplServiceLocator;
import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.db.service.impl.DBTicketServiceImpl;
import ua.be.dc.services.ticketService.models.Event;
import ua.be.dc.services.ticketService.models.Ticket;

public class TicketServiceManager implements ITicketServiceManager {

	private IDBEventService dbEventService = new DBEventServiceImpl();
	private IDBTicketService dbTicketService = new DBTicketServiceImpl();

	/**
	 * Notify other web services
	 * @param event
	 */
	public void notify(Event event) {
		SeatAccommodationServiceImplServiceLocator serviceLocator = new SeatAccommodationServiceImplServiceLocator();
		SeatAccommodationService seatAccommodationService = null;
		try {
			seatAccommodationService = serviceLocator
					.getSeatAccommodationServiceImplPort();
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ua.be.dc.services.seatAccommodation.service.Event seatAServiceEvent = new ua.be.dc.services.seatAccommodation.service.Event();
		seatAServiceEvent.setId(event.getId());
		seatAServiceEvent.setName(event.getName());

		try {
			seatAccommodationService.registerEvent(seatAServiceEvent);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void createEvent(Event event) {
		dbEventService.insert(event);
		notify(event);
	}

	@Override
	public String test() {
		return "test";
	}

	@Override
	public Ticket[] getTicketsByEvent(Event event) {
		List<Ticket> ticketsList = dbTicketService.getByEventId(event.getId());
		
		return ticketsList.toArray(new Ticket[ticketsList.size()]);
	}

	@Override
	public Ticket getTicketById(Integer id) {
		return dbTicketService.getById(id);
	}

	@Override
	public void updateTicket(Ticket ticket) {
		dbTicketService.update(ticket);
	}

}
