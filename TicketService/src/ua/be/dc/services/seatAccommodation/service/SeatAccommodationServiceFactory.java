/**
 * 
 */
package ua.be.dc.services.seatAccommodation.service;

import javax.xml.rpc.ServiceException;

/**
 * @author Pau
 *
 */
public class SeatAccommodationServiceFactory {
	
	private static SeatAccommodationService seatAccommodationService;
	
	static {
		try {
			if (seatAccommodationService == null) {
				SeatAccommodationServiceImplServiceLocator serviceLocator = new SeatAccommodationServiceImplServiceLocator();
				seatAccommodationService = serviceLocator.getSeatAccommodationServiceImplPort();
			}
		} catch (ServiceException e) {
			System.out.println("Seat Accommodation Service couldn't be located");
			e.printStackTrace();
		}
	}
	
	public static SeatAccommodationService getService() {
		return seatAccommodationService;
	}
}
