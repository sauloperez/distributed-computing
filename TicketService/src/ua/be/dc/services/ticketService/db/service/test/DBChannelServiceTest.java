package ua.be.dc.services.ticketService.db.service.test;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import ua.be.dc.services.ticketService.db.service.IDBChannelService;
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
		Channel channel = new Channel();
		channel.setName("Channel name " + System.currentTimeMillis());
		
		dbChannelService.insert(channel);
		Assert.assertTrue(channel.getId() != 0);
		
		Channel createdChannel = dbChannelService.getById(channel.getId());
		Assert.assertNotNull(createdChannel);
		Assert.assertEquals(channel.getName(), createdChannel.getName());
	}
	
	@Test
	public void testUpdate() {
		long timestamp = System.currentTimeMillis();
		
		Channel channel = dbChannelService.getById(2);
		channel.setName("Test name " + timestamp);
		dbChannelService.update(channel);
		
		Channel updatedChannel = dbChannelService.getById(2);
		Assert.assertEquals(channel.getName(), updatedChannel.getName());
	}
	
	@Test
	public void testDelete() {
		Channel channel = dbChannelService.getById(3);
		dbChannelService.deleteById(channel.getId());
		
		Channel deletedChannel = dbChannelService.getById(3);
		Assert.assertNull(deletedChannel);
	}
}
