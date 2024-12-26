package Notif;
import java.util.GregorianCalendar;

public class Notification {

	public GregorianCalendar date_time;
	public String content;
	
	public Notification(GregorianCalendar date_time, String content) {
		this.date_time = date_time;
		this.content = content;
	}
	
	 @Override
	    public String toString() {
	        return "The date and time: " + date_time.getTime() + "\nContent: " + content;
	    }
	
}
