package Notif;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.ListIterator;
public class MessageList_Inbox {

	   public ArrayList<Message> msg;
	   
	   public MessageList_Inbox(){
		   msg = new ArrayList<>(); 
	   }
	 
	    public void addMessage(Message m) {
	        msg.add(m);  
	    }

	    public void removeMessage(Message m) {
	        msg.remove(m);
	    }
	    
	    public List<Message> SearchMessages (){
	    ListIterator<Message> iter = msg.listIterator();
	    List <Message> Messages= new ArrayList<>();
	    while(iter.hasNext()){
	        Message m = iter.next();
	            Messages.add(m);
	    }
	        return Messages;      
	    }
	    
	 public Message searchForMessagebyDateTime(GregorianCalendar date_time){
	    ListIterator<Message> iter = msg.listIterator();
	    Message m0 = null;
	    
	    while (iter.hasNext()) {
	        Message m = iter.next();
	        if (m.date_time.equals(date_time)) {
	            return m;
	        }
	    } 
	    return m0; 
	}
	 

	    
	public void sortMessagebyDateTime(Comparator<Message> comparator) {
	   Collections.sort(this.msg,comparator);
	}
	
	@Override
	public String toString(){
	    if (msg.isEmpty()){ 
	        return "No message";
	    }
	    ListIterator<Message> iter = msg.listIterator();
	    String str =" ";
	    while(iter.hasNext()){
	        Message msg = iter.next();
	        str = str + msg.toString() + "\n";
	      }
	    return str;
		}
	}
