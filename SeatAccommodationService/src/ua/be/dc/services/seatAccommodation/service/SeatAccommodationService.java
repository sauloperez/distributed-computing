package ua.be.dc.services.seatAccommodation.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

@WebService
public interface SeatAccommodationService {

	@WebMethod
	public String test();
	
	/**
     * Returns all the Seats available for an Event.
     * @param event event whose seats we look for.
     * @return List of Seats of event. Null if the event does not exist.
     */
	@WebMethod
	public Seat[] getSeatsByEvent(Event event);
	
	/**
     * Returns all the Seats of type seatType available for an Event.
     * @param event event whose seats we look for.
     * @param seatType type of the seats to look for.
     * @return Seats list of seatType for the event. Null if the event does not exist.
     */
	@WebMethod
	public Seat[] getSeatsByEventAndType(Event event, SeatType seatType);
	
	/**
     * Returns a Seat.
     * @param id primary key value used for lookup.
     * @return A Seat with a primary key value equals to id. Null if it does not exist.
     */
	@WebMethod
	public Seat getSeatById(Integer id);
	
	/**
     * 
     * @param 
     */
	@WebMethod
	public void registerEvent(Event event);
	
	/**
     * 
     * @param 
     */
	@WebMethod
	public void unregisterEvent(Event event);
	
}
