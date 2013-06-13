package ua.be.dc.services.seatAccommodation.models;

import java.sql.Timestamp;
import java.util.UUID;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
public class Event {

	// Token acts as a public id. We must use it to uniquely identify the event 
	// in every public web service operation
	private Integer id;
	private String token;
	private String name;
		
	@XmlJavaTypeAdapter(TimestampAdapter.class)
	private Timestamp date;
	// Used to transmit the timestamp since this data type is not supported by JAXB
	private long timestamp;

	public Event() {
		generateToken();
	}

	public Event(Integer id) {
		this.id = id;
		generateToken();
	}

	public Event(String name) {
		super();
		this.name = name;
		generateToken();
	}
	
	public Event(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
		generateToken();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	private void generateToken() {
		UUID uniqueKey = UUID.randomUUID();
		token = uniqueKey.toString();
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
		return "Event: [id = " + id + ", token = " + token + ", name = " + name + ", date = " + date.toString() +"]";
	}
}
