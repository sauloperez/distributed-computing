package ua.be.dc.services.seatAccommodation.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import ua.be.dc.services.seatAccommodation.models.Event;

@WebService
public interface SeatAccommodationService {

	/**
	 * 
	 * @return
	 */
	@WebMethod
	public Integer getTotalNumber(Event event);
	
	
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
