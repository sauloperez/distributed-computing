package ua.be.dc.services.sellingService.db.service;

import java.util.List;

import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.models.EventOrganizer;

public interface IDBEventOrganizerService {

	public EventOrganizer getById(Integer id);

	public List<EventOrganizer> getAll();

	public void insert(EventOrganizer eventOrganizer) throws DBServiceException;

	public void update(EventOrganizer eventOrganizer) throws DBServiceException;

	public void deleteById(Integer id) throws DBServiceException;
}
