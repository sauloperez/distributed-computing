package ua.be.dc.services.sellingService.models;

import ua.be.dc.services.ticketService.service.Event;

public class EventDetail {

	private Integer id;
	private String eventToken;
	private EventOrganizer eventOrganizer;
	
	public EventDetail() {
	}

	public EventDetail(Event event) {
		eventToken = event.getToken();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEventToken() {
		return eventToken;
	}

	public void setEventToken(String token) {
		this.eventToken = token;
	}

	public EventOrganizer getEventOrganizer() {
		return eventOrganizer;
	}

	public void setEventOrganizer(EventOrganizer eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}

}
