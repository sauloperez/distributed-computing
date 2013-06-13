package ua.be.dc.services.seatAccommodation.manager;

import java.util.List;

import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.Seat;

/**
 * Specifies all required methods that a Seat manager must implement
 * Is intended to be used by an administrator through a client such a CLI or a webapp.
 * 
 * @author Pau
 *
 */
public interface ISeatServiceManager {

	public List<Seat> getSeats();
	
	public void deleteSeatById(Integer seatId) throws Exception;
	
	public void createSeat(Seat seat) throws Exception;

	public void createSeatForEvent(Event event, Seat seat) throws Exception;
}
