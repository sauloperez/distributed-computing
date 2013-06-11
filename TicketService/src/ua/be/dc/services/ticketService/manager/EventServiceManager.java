package ua.be.dc.services.ticketService.manager;

import java.rmi.RemoteException;
import java.util.List;

import ua.be.dc.services.seatAccommodation.service.SeatAccommodationService;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceFactory;
import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.impl.DBEventServiceImpl;
import ua.be.dc.services.ticketService.models.Event;

public class EventServiceManager implements IEventServiceManager {

	private SeatAccommodationService seatAccommodationService;
	private IDBEventService dbEventService = new DBEventServiceImpl();
	
	public EventServiceManager() {
		seatAccommodationService = SeatAccommodationServiceFactory.getService();
	}
	
	/**
	 * Notify other web services that an event occurred
	 * @param ev
	 * @throws RemoteException 
	 */
	private void dispatch(EventTypeEnum ev, Object object) throws RemoteException {
		switch (ev) {
		case CREATE:
			try {
				Event event = (Event) object;
				ua.be.dc.services.seatAccommodation.service.Event seatAServiceEvent = new ua.be.dc.services.seatAccommodation.service.Event();
				seatAServiceEvent.setId(event.getId());
				seatAServiceEvent.setName(event.getName());
				
				seatAccommodationService.registerEvent(seatAServiceEvent);
			} catch (RemoteException e) {
				throw new RemoteException(e.getMessage());
			}
			break;
			
		case DELETE:
			try {
				Event event = (Event) object;
				ua.be.dc.services.seatAccommodation.service.Event seatAServiceEvent = new ua.be.dc.services.seatAccommodation.service.Event();
				seatAServiceEvent.setId(event.getId());
				
				seatAccommodationService.unregisterEvent(seatAServiceEvent);
			} catch (RemoteException e) {
				throw new RemoteException(e.getMessage());
			} 
			
		default:
			break;
		}
		
	}
	
	@Override
	public List<Event> getEvents() {
		return dbEventService.getAll();
	}

	@Override
	public void createEvent(Event event) throws Exception {
		try {
			dispatch(EventTypeEnum.CREATE, event);
			dbEventService.insert(event);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void deleteEventById(Integer eventId) throws Exception {
		try {
			dispatch(EventTypeEnum.DELETE, new Event(eventId));
			dbEventService.deleteById(eventId);
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	}

}
