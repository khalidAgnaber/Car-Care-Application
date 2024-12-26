package Notif;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ListIterator;
public class NotificationList_Center {

	    public ArrayList<Notification> noti;
	    
	    //constructor
	   public NotificationList_Center(){
		   noti = new ArrayList<>();
		   
	   }
	 
	    public void addNotification(Notification n) {
	    	noti.add(n);
	        
	    }

	    public void removeNotification(Notification n) {
	    	noti.remove(n);
	    }
	    public List<Notification> SearchNotifications (){
	    ListIterator<Notification> iter = noti.listIterator();
	    List <Notification> Notifications= new ArrayList<>();
	    while(iter.hasNext()){
	    	Notification n = iter.next();
	            Notifications.add(n);
	    }
	        return Notifications;
	           
	 }
	    
	        
	 public Notification searchForNotificationsbyDateTime(GregorianCalendar date_time){
	    ListIterator<Notification> iter = noti.listIterator();
	    Notification n0 = null;
	    
	    while (iter.hasNext()) {
	    	Notification n = iter.next();
	        if (n.date_time.equals(date_time)) {
	            return n;
	        }
	    } 
	    return n0; 
	}
	 

	    
	public void sortNotificationsbyDateTime(Comparator<Notification> comparator) {
	   Collections.sort(this.noti,comparator);
	}
	@Override
	public String toString(){
	    if (noti.isEmpty()){ 
	        return "No notification";
	    }
	    ListIterator<Notification> iter = noti.listIterator();
	    String str =" ";
	    while(iter.hasNext()){
	    	Notification noti = iter.next();
	        str = str + noti.toString() + "\n";
	      }

	    return str;
	}

	}
