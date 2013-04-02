package ua.be.dc.services.seatAccommodation.db.service;

import java.util.List;

import ua.be.dc.services.seatAccommodation.models.Seat;

public interface IDBSeatService {

	public List<Seat> getAll();

	public Seat getById(Integer id);

	public void insert(Seat seat);

	public void update(Seat seat);

	public void deleteById(Integer id);

}
