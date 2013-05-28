package ua.be.dc.services.ticketService.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.ticketService.db.service.IDBChannelService;
import ua.be.dc.services.ticketService.db.service.exception.DBServiceException;
import ua.be.dc.services.ticketService.db.service.impl.DBChannelServiceImpl;
import ua.be.dc.services.ticketService.models.Channel;

public class DBChannelServiceTest {

	private static IDBChannelService dbChannelService;
	
	@BeforeClass
	public static void setup() {
		dbChannelService = new DBChannelServiceImpl();
	}
	
	@AfterClass
	public static void teardown() {
		dbChannelService = null;
	}
	
	@Test
	public void testGetById() {
		Channel channel = dbChannelService.getById(1);
		Assert.assertNotNull(channel);
		System.out.println(channel);
	}
	
	@Test
	public void testGetAll() {
		List<Channel> channels = dbChannelService.getAll();
		Assert.assertNotNull(channels);
		for (Channel channel : channels) {
			System.out.println(channel);
		}
	}
	
	@Test
	public void testInsert() {
		try {
			Channel channel = new Channel();
			channel.setName("Channel name " + System.currentTimeMillis());
			
			dbChannelService.insert(channel);
			
			Assert.assertTrue(channel.getId() != 0);
			
			Channel createdChannel = dbChannelService.getById(channel.getId());
			Assert.assertNotNull(createdChannel);
			Assert.assertEquals(channel.getName(), createdChannel.getName());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	

	@Test(expected = DBServiceException.class)
	public void testInsertEmpty() throws DBServiceException {
		dbChannelService.insert(new Channel());
	}
	
	@Test
	public void testUpdate() {
		try {
			int channelId = 2;
			long timestamp = System.currentTimeMillis();
			
			Channel channel = dbChannelService.getById(channelId);
			channel.setName("Test name " + timestamp);
			
			dbChannelService.update(channel);
			
			Channel updatedChannel = dbChannelService.getById(channelId);
			Assert.assertEquals(channel.getName(), updatedChannel.getName());
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testUpdateByInvalidChannel() throws DBServiceException {
		dbChannelService.update(new Channel());
	}
	
	@Test
	public void testDelete() {
		try {
			int channelId = 4;
			Channel channel = dbChannelService.getById(channelId);
			dbChannelService.deleteById(channel.getId());
			
			Channel deletedChannel = dbChannelService.getById(channelId);
			Assert.assertNull(deletedChannel);
		} catch (DBServiceException e) {
			e.printStackTrace();
		}
	}
	
	@Test(expected = DBServiceException.class)
	public void testDeleteByInvalidId() throws DBServiceException {
		int channelId = -1;
		dbChannelService.deleteById(channelId);
	}
}
