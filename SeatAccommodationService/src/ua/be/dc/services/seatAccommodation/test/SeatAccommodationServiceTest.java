package ua.be.dc.services.seatAccommodation.test;

import java.sql.Timestamp;
import java.util.Date;

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
		String token = "ce5faeaf-c42e-4c25-ade4-1aadc3398597";
		
		Event event = new Event();
		event.setToken(token);
		
		Seat[] seats = seatAccommodationService.getSeatsByEvent(event);
		Assert.assertNotNull(seats);
		for (Seat seat : seats) {
			System.out.println(seat);
		}
	}
	
	@Test
	public void testGetSeatsByEventAndType() {
		String token = "ce5faeaf-c42e-4c25-ade4-1aadc3398597";
		int typeId = 1;
		
		Event event = new Event();
		event.setToken(token);
		SeatType seatType = new SeatType(typeId);
		
		Seat[] seats = seatAccommodationService.getSeatsByEventAndType(event, seatType);
		Assert.assertNotNull(seats);
		for (Seat seat : seats) {
			Assert.assertNotNull(seat);
			Assert.assertNotNull(seat.getType());
			System.out.println(seat);
		}
	}
	
	@Test
	public void testRegisterEvent() {
		try {
			String token = "ae792c5e-4f80-4759-80a8-6401a42f940f";
			
			Event event = new Event();
			event.setToken(token);
			event.setName("test name");
			Date date = new Date();
			event.setTimestamp(date.getTime());
			
			seatAccommodationService.registerEvent(event);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void testUnregisterEvent() {
		try {
			String token = "ae792c5e-4f80-4759-80a8-6401a42f940f";
			
			Event event = new Event();
			event.setToken(token);
			
			seatAccommodationService.unregisterEvent(event);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
}
