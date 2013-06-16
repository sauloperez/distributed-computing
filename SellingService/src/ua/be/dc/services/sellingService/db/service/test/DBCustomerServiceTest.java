package ua.be.dc.services.sellingService.db.service.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ua.be.dc.services.sellingService.db.service.IDBCustomerService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBCustomerServiceImpl;
import ua.be.dc.services.sellingService.models.Customer;

public class DBCustomerServiceTest {
	
	private static IDBCustomerService dbCustomerService;

	@Before
	public void setUp() throws Exception {
		dbCustomerService = new DBCustomerServiceImpl();
	}

	@After
	public void tearDown() throws Exception {
		dbCustomerService = null;
	}

	@Test
	public final void testGetById() {
		int customerId = 1;
		
		Customer customer = dbCustomerService.getById(customerId);
		Assert.assertNotNull(customer);
		System.out.println(customer);
	}

	@Test
	public final void testGetAll() {
		List<Customer> customers = dbCustomerService.getAll();
		Assert.assertNotNull(customers);
		for (Customer customer : customers) {
			System.out.println(customer);
		}
	}

	@Test
	public final void testInsert() {
		try {
			Customer customer = new Customer();
			customer.setName("Test name");
			customer.setSurname("Test surname");
			customer.setCountry("Catalunya");
			customer.setAddress("Carrer Mossèn Camill Rossell, 82, 3r 1ª");
			customer.setEmail("test@test.com");
			customer.setPhone("999999999");
		
			dbCustomerService.insert(customer);
		
			Assert.assertTrue(customer.getId() != 0);
			
			Customer createdCustomer = dbCustomerService.getById(customer.getId());
			Assert.assertNotNull(createdCustomer);
			Assert.assertEquals(customer.getAddress(), createdCustomer.getAddress());
			Assert.assertEquals(customer.getCountry(), createdCustomer.getCountry());
			Assert.assertEquals(customer.getEmail(), createdCustomer.getEmail());
			Assert.assertEquals(customer.getName(), createdCustomer.getName());
			Assert.assertEquals(customer.getSurname(), createdCustomer.getSurname());
			Assert.assertEquals(customer.getPhone(), createdCustomer.getPhone());
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public final void testUpdate() {
		try {
			int customerId = 1;
			
			Customer customer = dbCustomerService.getById(customerId);
			customer.setName("Test update name");
			customer.setSurname("Test update surname");
			customer.setCountry("Belgium");
			customer.setAddress("Carrer Mossèn Camill Rossell, 82, 3r 1ª");
			customer.setEmail("test@test_update.com");
			customer.setPhone("999999999");
		
			dbCustomerService.update(customer);
					
			Customer updatedCustomer = dbCustomerService.getById(customer.getId());
			Assert.assertNotNull(updatedCustomer);
			Assert.assertEquals(customer.getAddress(), updatedCustomer.getAddress());
			Assert.assertEquals(customer.getCountry(), updatedCustomer.getCountry());
			Assert.assertEquals(customer.getEmail(), updatedCustomer.getEmail());
			Assert.assertEquals(customer.getName(), updatedCustomer.getName());
			Assert.assertEquals(customer.getSurname(), updatedCustomer.getSurname());
			Assert.assertEquals(customer.getPhone(), updatedCustomer.getPhone());
		} catch (DBServiceException e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidCustomer() throws DBServiceException {
		dbCustomerService.update(new Customer());
	}

	@Test
	public void testDelete() {
		try {
			int customerId = 3;
			
			dbCustomerService.deleteById(customerId);
			
			Customer deletedCustomer = dbCustomerService.getById(3);
			Assert.assertNull(deletedCustomer);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int customerId = -1;
		dbCustomerService.deleteById(customerId);
	}
}
