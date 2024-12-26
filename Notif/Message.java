package Notif;
import Profile.*;
import java.util.GregorianCalendar;

public class Message {

	public GregorianCalendar date_time;
	public String message;
	public Renter r;
	public Owner ow;
	public Notification n;
	
	public Message(GregorianCalendar date_time, String message, Renter r, Owner ow) {
		this.date_time = date_time;
		this.message = message;
		this.r = r;
		this.ow = ow;
	}
	@Override
	public String toString() {
		return "Date time: " + date_time.getTime() + "| Message: " + message + "| Renter: " + r + "| Owner: " + ow;
	}
}
