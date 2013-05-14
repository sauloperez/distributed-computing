package ua.be.dc.services.seatAccommodation.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.seatAccommodation.db.service.IDBSeatTypeService;
import ua.be.dc.services.seatAccommodation.db.service.exception.DBServiceException;
import ua.be.dc.services.seatAccommodation.db.service.impl.DBSeatTypeServiceImpl;
import ua.be.dc.services.seatAccommodation.models.SeatType;

public class DBSeatTypeServiceTest {

	private static IDBSeatTypeService dbSeatTypeService;

	@BeforeClass
	public static void setup() {
		dbSeatTypeService = new DBSeatTypeServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbSeatTypeService = null;
	}
	
	@Test
	public void testGetById() {
		SeatType seatType = dbSeatTypeService.getById(1);
		Assert.assertNotNull(seatType);
		System.out.println(seatType);
	}
	
	@Test
	public void testGetByInvalidId() {
		SeatType seatType = dbSeatTypeService.getById(-1);
		Assert.assertNull(seatType);
	}
	
	@Test
	public void testGetAll() {
		List<SeatType> seatTypes = dbSeatTypeService.getAll();
		Assert.assertNotNull(seatTypes);
		for (SeatType seatType : seatTypes) {
			System.out.println(seatType);
		}
	}
	
	@Test
	public void testInsert() {
		try {
			SeatType seatType = new SeatType();
			seatType.setName("SeatType name " + System.currentTimeMillis());
			
			dbSeatTypeService.insert(seatType);
			
			Assert.assertTrue(seatType.getId() != 0);
			
			SeatType createdSeatType = dbSeatTypeService.getById(seatType.getId());
			Assert.assertNotNull(createdSeatType);
			Assert.assertEquals(seatType.getName(), createdSeatType.getName());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testInserByInvalidSeatType() throws DBServiceException {
		dbSeatTypeService.insert(new SeatType());
	}
	
	@Test
	public void testUpdate() {
		try {
			long timestamp = System.currentTimeMillis();
			
			SeatType seatType = dbSeatTypeService.getById(2);
			seatType.setName("Test name " + timestamp);
			
			dbSeatTypeService.update(seatType);
			
			SeatType updatedSeatType = dbSeatTypeService.getById(2);
			Assert.assertEquals(seatType.getName(), updatedSeatType.getName());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidSeatType() throws DBServiceException {
		dbSeatTypeService.update(new SeatType());
	}
	
	@Test
	public void testDelete() {
		try {
			int seatTypeId = 5;
			SeatType seatType = dbSeatTypeService.getById(seatTypeId);
			dbSeatTypeService.deleteById(seatType.getId());

			SeatType deletedSeatType = dbSeatTypeService.getById(seatTypeId);
			Assert.assertNull(deletedSeatType);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		dbSeatTypeService.deleteById(-1);
	}
}
