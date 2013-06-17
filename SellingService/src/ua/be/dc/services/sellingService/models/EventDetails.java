package ua.be.dc.services.sellingService.models;

import ua.be.dc.services.ticketService.service.Event;

public class EventDetails {

	private String token;
	private EventOrganizer eventOrganizer;

	public EventDetails(Event event) {
		token = event.getToken();
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public EventOrganizer getEventOrganizer() {
		return eventOrganizer;
	}

	public void setEventOrganizer(EventOrganizer eventOrganizer) {
		this.eventOrganizer = eventOrganizer;
	}

}
