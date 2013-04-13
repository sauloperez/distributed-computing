package ua.be.dc.services.seatAccommodation.models;

public class Seat {

	private Integer id;
	private SeatType type;
	
	public Seat() {}
	
	public Seat(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SeatType getType() {
		return type;
	}

	public void setType(SeatType type) {
		this.type = type;
	}
	
	public String toString() {
		return "Seat: [id = " + id + ", type = " + type.getName() + "]";
	}
}
