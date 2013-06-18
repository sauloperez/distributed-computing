package ua.be.dc.services.sellingService.models;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OrderDetail {
	
	private static Logger logger = LogManager.getLogger(TicketDetail.class.getName());

	private Integer id;
	private String name;
	private List<TicketDetail> ticketsDetails;
	private Float price;
	private Order order;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		if (ticketsDetails != null) {
			return ticketsDetails.size();
		}
		return 0;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public List<TicketDetail> getTicketsDetails() {
		return ticketsDetails;
	}

	public void setTicketsDetails(List<TicketDetail> ticketsDetails) {
		this.ticketsDetails = ticketsDetails;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
