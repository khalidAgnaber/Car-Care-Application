package Notif;

public class Notification_center {
	 NotificationList_Center notis = new NotificationList_Center();
	
	public void view_notification() {
		 System.out.println(notis.toString());
	}
	
	public void remove_notification(Notification n) {
		notis.removeNotification(n);
	}
	
	
	
}
