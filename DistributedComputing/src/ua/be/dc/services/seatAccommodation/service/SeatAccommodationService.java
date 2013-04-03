package ua.be.dc.services.seatAccommodation.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

@WebService
public interface SeatAccommodationService {

	/**
     * Returns all the Seats available for an Event.
     * @param event event whose seats we look for.
     * @return List of Seats of event. Null if the event does not exist.
     */
	@WebMethod
	public List<Seat> getSeatsByEvent(Event event);
	
	/**
     * Returns all the Seats of type seatType available for an Event.
     * @param event event whose seats we look for.
     * @param seatType type of the seats to look for.
     * @return Seats list of seatType for the event. Null if the event does not exist.
     */
	@WebMethod
	public List<Seat> getSeatsByEventAndType(Event event, SeatType seatType);
	
	/**
     * Returns a Seat.
     * @param id primary key value used for lookup.
     * @return A Seat with a primary key value equals to id. Null if there is no matching row.
     */
	@WebMethod
	public Seat getSeatById(Integer id);
	
	
	/* CLI methods to manage the service */
	
	/**
	 * 
	 * @return
	 */
	public Boolean create(Integer seatNumber);
	
	/**
	 * 
	 * @return
	 */
	public Boolean update(Integer seatNumber, Integer newSeatNumber);
	
	/**
	 * 
	 * @return
	 */
	public Boolean delete(Integer seatNumber);
	
}
