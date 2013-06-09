package ua.be.dc.services.sellingService.manager;

import java.util.List;

import ua.be.dc.services.sellingService.models.EventOrganizer;

public interface IEventOrganizerServiceManager {
	
	public List<EventOrganizer> getEventOrganizers();

	public void addEventOrganizer(EventOrganizer eventOrganizer) throws Exception;
	
	public void deleteEventOrganizerById(Integer eventOrganizerId) throws Exception;
}
