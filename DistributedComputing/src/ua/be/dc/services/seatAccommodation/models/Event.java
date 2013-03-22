package ua.be.dc.services.seatAccommodation.models;

public class Event {
	
	private Integer id;
	private String name;
	
	public Event() {}
	
	public Event(String name) {
		super();
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
}
