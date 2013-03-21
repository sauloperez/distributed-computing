package ua.be.dc.services.seatAccommodation.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface SeatAccommodationService {

	/**
	 * 
	 * @return
	 */
	@WebMethod
	public Integer getTotalNumber();
	
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
