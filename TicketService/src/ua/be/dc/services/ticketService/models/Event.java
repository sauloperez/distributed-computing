package ua.be.dc.services.ticketService.models;

public class Event {

	private Integer id;
	private String name;

	public Event() {
	}

	public Event(Integer id) {
		super();
		this.id = id;
	}

	public Event(String name) {
		super();
		this.name = name;
	}

	public Event(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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
	
	public String toString() {
		return "Event: [id = " + id + ", name = " + name + "]";
	}
}
