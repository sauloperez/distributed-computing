package ua.be.dc.services.seatAccommodation.models;

import java.sql.Timestamp;
import java.util.Date;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class TimestampAdapter extends XmlAdapter<Date, Timestamp> {

	@Override
	public Timestamp unmarshal(Date v) throws Exception {
		return (Timestamp) new Date(v.getTime());
	}

	@Override
	public Date marshal(Timestamp v) throws Exception {
		return new Timestamp(v.getTime());
	}

}
