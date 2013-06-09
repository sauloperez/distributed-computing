package ua.be.dc.services.sellingService.manager;

import java.util.List;

import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerImpl;
import ua.be.dc.services.sellingService.models.EventOrganizer;

public class EventOrganizerManager implements IEventOrganizerServiceManager {

	private IDBEventOrganizerService dbEventOrganizerService = new DBEventOrganizerImpl();
	
	@Override
	public void addEventOrganizer(EventOrganizer eventOrganizer) throws Exception {
		try {
			dbEventOrganizerService.insert(eventOrganizer);
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public void deleteEventOrganizerById(Integer eventOrganizerId) throws Exception {
		try {
			dbEventOrganizerService.deleteById(eventOrganizerId);
		} catch (DBServiceException e) {
			throw new Exception(e.getMessage());
		}
	}

	@Override
	public List<EventOrganizer> getEventOrganizers() {
		return dbEventOrganizerService.getAll();
	}

}
