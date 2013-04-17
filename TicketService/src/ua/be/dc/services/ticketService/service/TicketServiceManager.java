package ua.be.dc.services.ticketService.service;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import ua.be.dc.services.seatAccommodation.service.SeatAccommodationService;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImplServiceLocator;
import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.models.Event;

public class TicketServiceManager implements ITicketServiceManager {

	private IDBEventService dbEventService;

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
		dbEventService = new DBEventServiceImpl();
		dbEventService.insert(event);
		
		notify(event);
	}

}
