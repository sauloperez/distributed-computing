package ua.be.dc.services.seatAccommodation.db.service;

import java.util.List;

import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public interface IDBSeatTypeService {

	public SeatType getById(Integer id);

	public List<SeatType> getAll();

	public void insert(SeatType seatType) throws DBServiceException;

	public void update(SeatType seatType) throws DBServiceException;

	public void deleteById(Integer id) throws DBServiceException;
}
