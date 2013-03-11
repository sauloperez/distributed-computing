package ua.be.dc.services.seatAccomodation;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ISeatAccommodationService {

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
	@WebMethod
	public Boolean create(Integer seatNumber);
	
	/**
	 * 
	 * @return
	 */
	@WebMethod
	public Boolean update(Integer seatNumber, Integer newSeatNumber);
	
	/**
	 * 
	 * @return
	 */
	@WebMethod
	public Boolean delete(Integer seatNumber);
	
}
