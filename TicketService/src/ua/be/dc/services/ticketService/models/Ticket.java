package ua.be.dc.services.ticketService.models;

public class Ticket {

	private Integer id;
	private Event event;
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

	public String toString() {
		return "Ticket: [id = " + id + ", event = " + event.getId() + ", channel = " + channel.getId() + ", price = " + price + ", sold = " + sold + ", available = " + available + "]";
	}
}
