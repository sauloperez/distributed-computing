package ua.be.dc.services.sellingService.models;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import ua.be.dc.services.sellingService.service.exception.InvalidTicketException;
import ua.be.dc.services.ticketService.service.Ticket;

public class Order {

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
	 * Builds an order from a list of tickets to be bought. We assume all the tickets are for the same event
	 * So there is only one orderDetail
	 * @param tickets
	 * @throws InvalidTicketException 
	 * @throws Exception 
	 */
	public Order(Ticket[] tickets) throws InvalidTicketException {
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setName("Tickets for event");
		orderDetail.setTicketsDetails(tickets);

		orderDetails = new ArrayList<OrderDetail>();
		orderDetails.add(orderDetail);
		
		totalPrice = orderDetail.getPrice();
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
