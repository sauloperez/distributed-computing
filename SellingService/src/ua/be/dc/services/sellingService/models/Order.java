package ua.be.dc.services.sellingService.models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import ua.be.dc.services.sellingService.db.service.IDBEventDetailService;
import ua.be.dc.services.sellingService.db.service.IDBEventOrganizerService;
import ua.be.dc.services.sellingService.db.service.IDBOrderDetailService;
import ua.be.dc.services.sellingService.db.service.IDBOrderService;
import ua.be.dc.services.sellingService.db.service.IDBTicketDetailService;
import ua.be.dc.services.sellingService.db.service.exception.DBServiceException;
import ua.be.dc.services.sellingService.db.service.impl.DBEventDetailServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBEventOrganizerServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderDetailServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBOrderServiceImpl;
import ua.be.dc.services.sellingService.db.service.impl.DBTicketDetailServiceImpl;
import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Event;
import ua.be.dc.services.ticketService.service.Ticket;

public class Order {

	private static Logger logger = LogManager.getLogger(Order.class.getName());
	
	private static IDBOrderService dbOrderService = new DBOrderServiceImpl();
	private static IDBOrderDetailService dbOrderDetailService = new DBOrderDetailServiceImpl();
	private static IDBEventOrganizerService dbEventOrganizerService = new DBEventOrganizerServiceImpl();
	private static IDBEventDetailService dbEventDetailService = new DBEventDetailServiceImpl();
	private static IDBTicketDetailService dbTicketDetailService = new DBTicketDetailServiceImpl();
	
	private Integer id;
	private String token;
	private String transactionId;
	private Customer customer;
	private List<OrderDetail> orderDetails;
	private Float totalPrice;
	private Timestamp created; // Set by the database on insert
	private Timestamp purchased;
	
	public Order() {
		this.orderDetails = new ArrayList<OrderDetail>();
	}
	
	/**
	 * Builds an order from a list of tickets to be bought. 
	 * NOTE we assume the ticket belongs to the eventOrganizer with id 1
	 * 
	 * @param tickets
	 * @throws DBServiceException 
	 * @throws InvalidTicketException 
	 * @throws Exception 
	 */
	public static Order createOrder(Customer customer, Ticket[] tickets) throws DBServiceException, InvalidTicketException {
		int eventOrganizerId = 1;
		float totalPrice = 0f;
		
		EventOrganizer eventOrganizer = dbEventOrganizerService.getById(eventOrganizerId);
		eventOrganizer.setId(eventOrganizerId);
		
		// Insert it in the DB to get its id
		Order order = new Order();
		order.setCustomer(customer);
		order.setTotalPrice(totalPrice);
		
		dbOrderService.insert(order);
		
		List<OrderDetail> orderDetails = new ArrayList<>();
		for (Ticket ticket : tickets) {
			validateTicket(ticket);
			
			// Get the event information
			Event event = ticket.getEvent();
			
			// Build the event detail and insert it in DB
			EventDetail eventDetail = new EventDetail();
			eventDetail.setEventOrganizer(eventOrganizer);
			eventDetail.setEventToken(event.getToken());
			
			dbEventDetailService.insert(eventDetail);
			
			// Build the ticket detail and insert it in DB
			TicketDetail ticketDetail = new TicketDetail();
			ticketDetail.setTicketId(ticket.getId());
			ticketDetail.setEventDetail(eventDetail);

			dbTicketDetailService.insert(ticketDetail);
			
			// Build the order detail and insert it in DB
			OrderDetail orderDetail = new OrderDetail();
			List<TicketDetail> ticketsDetails = new ArrayList<>();
			ticketsDetails.add(ticketDetail);
			orderDetail.setTicketsDetails(ticketsDetails);
			orderDetail.setPrice(ticket.getPrice());
			orderDetail.setName("Test orderDetail name");
			orderDetail.setOrder(order);
			
			dbOrderDetailService.insert(orderDetail);
			
			// Update the ticketDetail with the orderDetail it belongs to
			ticketDetail.setOrderDetail(orderDetail);
			dbTicketDetailService.update(ticketDetail);

			orderDetails.add(orderDetail);
			totalPrice += orderDetail.getPrice();
		}
		
		// Update the order with the stored orderDetails
		order.setOrderDetails(orderDetails);
		order.setTotalPrice(new Float(totalPrice));
		
		dbOrderService.update(order);
		
		return order;
	}
	
	private static void validateTicket(Ticket ticket) throws InvalidTicketException {
		if (ticket.getSold() != null && ticket.getSold()) {
			throw new InvalidTicketException("The ticket is already sold");
		}
		if (ticket.getAvailable() != null && !ticket.getAvailable()) {
			throw new InvalidTicketException("The ticket is not currently available");
		}
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	public void addOrderDetail(OrderDetail orderDetail) {
		this.orderDetails.add(orderDetail);
	}

	public Float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Timestamp getPurchased() {
		return purchased;
	}

	public void setPurchased(Timestamp purchased) {
		this.purchased = purchased;
	}

	public Timestamp getCreated() {
		return created;
	}
	
}
