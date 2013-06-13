package ua.be.dc.services.ticketService.manager;

import java.rmi.RemoteException;
import java.util.List;

import ua.be.dc.services.seatAccommodation.service.SeatAccommodationService;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceFactory;
import ua.be.dc.services.ticketService.db.service.IDBEventService;
import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
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
		Event event = (Event) object;
		ua.be.dc.services.seatAccommodation.service.Event seatAServiceEvent = new ua.be.dc.services.seatAccommodation.service.Event();
		switch (ev) {
		case CREATE:
			seatAServiceEvent.setId(event.getId());
			seatAServiceEvent.setName(event.getName());
			seatAServiceEvent.setDate(event.getDate());
			seatAServiceEvent.setTimestamp(event.getDate().getTime());
			seatAServiceEvent.setToken(event.getToken());
			
			seatAccommodationService.registerEvent(seatAServiceEvent);
			break;
			
		case DELETE:
			seatAServiceEvent.setId(event.getId());
			
			seatAccommodationService.unregisterEvent(seatAServiceEvent);
			break;
			
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
		} catch (RemoteException e) {
			throw new Exception("The event could not be registered in the event venue");
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void deleteEventById(Integer eventId) throws Exception {
		try {
			dispatch(EventTypeEnum.DELETE, new Event(eventId));
			dbEventService.deleteById(eventId);
		} catch (RemoteException e) {
			throw new Exception("The event could not be unregistered");
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}

}
