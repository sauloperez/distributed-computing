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
	 */
	public void dispatch(EventTypeEnum ev, Object object) {
		switch (ev) {
		case CREATE:
			try {
				Event event = (Event) object;
				ua.be.dc.services.seatAccommodation.service.Event seatAServiceEvent = new ua.be.dc.services.seatAccommodation.service.Event();
				seatAServiceEvent.setId(event.getId());
				seatAServiceEvent.setName(event.getName());
				
				seatAccommodationService.registerEvent(seatAServiceEvent);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case DELETE:
			try {
				Event event = (Event) object;
				ua.be.dc.services.seatAccommodation.service.Event seatAServiceEvent = new ua.be.dc.services.seatAccommodation.service.Event();
				seatAServiceEvent.setId(event.getId());
				
				seatAccommodationService.unregisterEvent(seatAServiceEvent);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
	public void createEvent(Event event) {
		dbEventService.insert(event);
		dispatch(EventTypeEnum.CREATE, event);
	}

	@Override
	public void deleteEventById(Integer eventId) {
		dbEventService.deleteById(eventId);
		dispatch(EventTypeEnum.DELETE, new Event(eventId));
	}

}
