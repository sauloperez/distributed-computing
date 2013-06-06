package ua.be.dc.services.sellingService.models;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Purchase {

	private Integer id;
	private String tickets;
	private Integer eventOrganizerId;
	private Timestamp timestamp;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getEventOrganizerId() {
		return eventOrganizerId;
	}

	public void setEventOrganizerId(Integer eventOrganizerId) {
		this.eventOrganizerId = eventOrganizerId;
	}

	public void setTicketsList(ArrayList<Integer> ticketsList) {
		String tickets = "";
		for (int i = 0; i < ticketsList.size()-1; i++) {
			tickets += String.valueOf(ticketsList.get(i)) + ":";
		}
		tickets += String.valueOf(ticketsList.get(ticketsList.size()-1));
		
		this.tickets = tickets;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public ArrayList<Integer> getTicketsList() {
		String[] ticketsArray = tickets.split(":");

		ArrayList<Integer> ticketsList = new ArrayList<Integer>();
		for (String ticket : ticketsArray) {
			ticketsList.add(Integer.parseInt(ticket));
		}
		return ticketsList;
	}
	
	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}
