package ua.be.dc.services.ticketService.models;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import ua.be.dc.services.seatAccommodation.service.Seat;

import ua.be.dc.services.seatAccommodation.service.SeatAccommodationService;
import ua.be.dc.services.seatAccommodation.service.SeatAccommodationServiceImplServiceLocator;

public class Ticket {

	private Integer id;
	private Event event;
	private Integer seatId;
	private Channel channel;
	private Float price;
	private Boolean sold;
	private Boolean available;
	
	public Ticket() {}
	
	public Ticket(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public Boolean getSold() {
		return sold;
	}

	public void setSold(Boolean sold) {
		this.sold = sold;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public Integer getSeatId() {
		return seatId;
	}

	public void setSeatId(Integer seatId) {
		this.seatId = seatId;
	}
	
	/**
     * Returns a Seat instance from the Seat Accommodation Service
     * @return A Seat with an id value equals to this.id, null otherwise
	 * @throws ServiceException 
	 * @throws RemoteException 
     */
	public Seat getSeat() throws ServiceException, RemoteException {
		SeatAccommodationServiceImplServiceLocator serviceLocator = new SeatAccommodationServiceImplServiceLocator();
		SeatAccommodationService seatAccommodationService;
		
		Seat seat = new Seat();
		seatAccommodationService = serviceLocator.getSeatAccommodationServiceImplPort();
		seat = seatAccommodationService.getSeatById(this.id);
		
		return seat;
	}
	
	public String toString() {
		return "Ticket: [id = " + id + ", event = " + event.getId() + ", seatId = " + seatId 
			 + ", channel = " + channel.getId() + ", price = " + price + ", sold = " + sold + ", available = " + available + "]";
	}
}
