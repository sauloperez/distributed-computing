package ua.be.dc.services.seatAccommodation.service;

public class SeatAccommodationClient {

	/**
	 * @param args
	 * @throws ServiceException 
	 */
	public static void main(String[] args) throws Exception {
		SeatAccommodationServiceImplServiceLocator serviceLocator = new SeatAccommodationServiceImplServiceLocator();
		SeatAccommodationService seatAccommodationService = serviceLocator.getSeatAccommodationServiceImplPort();

		System.out.println(seatAccommodationService.getSeatById(1));
//		Event event = new Event();
//		event.setId(1);
//		System.out.println(seatAccommodationService.getSeatsByEvent(event));
	}
}
