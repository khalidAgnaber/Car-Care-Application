package Notif;

import java.util.Comparator;

public class Inbox {
	MessageList_Inbox in = new MessageList_Inbox();

	public void search_message() {
		System.out.println(in.toString());	
	}
	
	public void sort_message(Comparator<Message> comparator) {
		//Collections.sort(this.in,comparator);
		
	}
	
	public void delete_message(Message m) {
		in.removeMessage(m);	
	}
	
	@Override
	public String toString() {
		
		return "Message" + in;
	}
}
