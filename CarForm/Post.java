package CarForm;
import Notif.*;
import java.util.GregorianCalendar;
public class Post {

		public GregorianCalendar date_time;
		public String post;
		public Car c;
		public Notification n;
		
		public Post(GregorianCalendar date_time, String content,Car c, Notification n) {
			this.date_time = date_time;
			post = content;
			this.c = c;
			this.n = n;
		}
		
		public void update_post(GregorianCalendar date_time, String content,Car c, Notification n) {
			this.date_time = date_time;
			post = content;
			this.c = c;
			this.n = n;
		}
		@Override
		public String toString() {
			return "Date time: " + date_time.getTime() + "| Message: " + post + "| Car: " + c + "| Notification: " + n;
		}
}