package ua.be.dc.services.ticketService.models;

import java.sql.Timestamp;

public class Event {

	private Integer id;
	private String name;
	private String location;
	private Timestamp date;

	public Event() {
	}

	public Event(Integer id) {
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
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	public String toString() {
		return "Event: [id = " + id + ", name = " + name + ", location = " + location + ", date = " + date.toString() +"]";
	}
}
