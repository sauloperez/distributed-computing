package ua.be.dc.services.seatAccommodation.models;

public class SeatType {

	private Integer id;
	private String name;
	
	public SeatType() {}
	
	public SeatType(Integer id) {
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
		return "SeatType: [id = " + id + ", name = " + name + "]";
	}

}
