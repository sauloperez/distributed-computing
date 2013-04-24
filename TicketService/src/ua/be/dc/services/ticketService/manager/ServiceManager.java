package ua.be.dc.services.ticketService.manager;

import java.rmi.RemoteException;

import ua.be.dc.services.seatAccommodation.service.SeatAccommodationService;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceFactory;
import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.IDBTicketService;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.db.service.impl.DBTicketServiceImpl;
import ua.be.dc.services.ticketService.models.Event;

public class ServiceManager implements IServiceManager {

	private IDBEventService dbEventService = new DBEventServiceImpl();
	private IDBTicketService dbTicketService = new DBTicketServiceImpl();
	
	private SeatAccommodationService seatAccommodationService;
	
	public ServiceManager() {
		seatAccommodationService = SeatAccommodationServiceFactory.getService();
	}

	/**
	 * Notify other web services
	 * @param event
	 */
	public void notifyEvent(Event event) {
		try {
			ua.be.dc.services.seatAccommodation.service.Event seatAServiceEvent = new ua.be.dc.services.seatAccommodation.service.Event();
			seatAServiceEvent.setId(event.getId());
			seatAServiceEvent.setName(event.getName());
			
			seatAccommodationService.registerEvent(seatAServiceEvent);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void createEvent(Event event) {
		dbEventService.insert(event);
		notifyEvent(event);
	}

	@Override
	public void deleteEventById(Integer eventId) {
		dbEventService.deleteById(eventId);
	}

	@Override
	public void deleteTicketById(Integer ticketId) {
		dbTicketService.deleteById(ticketId);
	}

}
