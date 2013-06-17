package ua.be.dc.services.seatAccommodation.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;

@WebService
public interface SeatAccommodationService {

	/**
     * Returns all the Seats available for an Event.
     * @param event event whose seats we look for. The event token must be set
     * @return List of Seats of event. Null if the event does not exist.
     */
	@WebMethod
	public Seat[] getSeatsByEvent(@WebParam(name = "event") Event event);
	
	/**
     * Returns all the Seats of type seatType available for an Event.
     * @param event event whose seats we look for. The event token must be set
     * @param seatType type of the seats to look for.
     * @return Seats list of seatType for the event. Null if the event does not exist.
     */
	@WebMethod
	public Seat[] getSeatsByEventAndType(@WebParam(name = "event") Event event, 
										 @WebParam(name = "seatType") SeatType seatType);
	
	/**
     * 
     * @param 
	 * @throws Exception 
     */
	@WebMethod
	public void registerEvent(@WebParam(name = "event") Event event) throws Exception;
	
	/**
     * 
     * @param 
	 * @throws Exception 
     */
	@WebMethod
	public void unregisterEvent(@WebParam(name = "event") Event event) throws Exception;
	
}
