package ua.be.dc.services.seatAccommodation.test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.seatAccommodation.models.Event;
import ua.be.dc.services.seatAccommodation.models.Seat;
import ua.be.dc.services.seatAccommodation.models.SeatType;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationService;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImpl;

public class SeatAccommodationServiceTest {
	
	private static SeatAccommodationService seatAccommodationService;

	@BeforeClass
	public static void setup() {
		seatAccommodationService = new SeatAccommodationServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		seatAccommodationService = null;
	}
	
	@Test
	public void testGetSeatsByEvent() {
		Event event = new Event(1);
		Seat[] seats = seatAccommodationService.getSeatsByEvent(event);
		Assert.assertNotNull(seats);
		for (Seat seat : seats) {
			System.out.println(seat);
		}
	}
	
	@Test
	public void testGetSeatsByEventAndType() {
		Event event = new Event(1);
		SeatType seatType = new SeatType(2);
		
		Seat[] seats = seatAccommodationService.getSeatsByEventAndType(event, seatType);
		Assert.assertNotNull(seats);
		for (Seat seat : seats) {
			Assert.assertNotNull(seat);
			Assert.assertNotNull(seat.getType());
			System.out.println(seat);
		}
	}
	
	@Test
	public void testGetSeatById() {
		Seat seat = seatAccommodationService.getSeatById(1);
		Assert.assertNotNull(seat);
		Assert.assertNotNull(seat.getType());
		System.out.println(seat);
	}
}
