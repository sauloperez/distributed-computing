package ua.be.dc.services.ticketService.models;

public class Channel {

	private Integer id;
	private String name;
	
	public Channel() {}
	
	public Channel(Integer id) {
		this.id = id;
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
		return "Channel: [id = " + id + ", name = " + name + "]";
		
	}
}
