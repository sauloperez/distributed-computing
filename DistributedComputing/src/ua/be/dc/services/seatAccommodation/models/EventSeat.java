package ua.be.dc.services.seatAccommodation.models;

public class EventSeat {

	private Integer id;
	private Event event;
	private Seat seat;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public String toString() {
		return "EventSeat: [id = " + id + ", event = " + event + ", seat = " + seat + " ]";
	}
}
