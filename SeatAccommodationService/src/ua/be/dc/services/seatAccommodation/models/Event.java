package ua.be.dc.services.seatAccommodation.models;

import java.sql.Timestamp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Event {

	private Integer id;
	private String name;
		
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp date;
	// Used to transmit the timestamp since this data type is not supported by JAXB
	private long timestamp;

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
	
	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	public String toString() {
		return "Event: [id = " + id + ", name = " + name + ", date = " + date.toString() +"]";
	}
}
