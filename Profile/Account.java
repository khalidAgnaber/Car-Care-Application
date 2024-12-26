package Profile;
import Notif.*;
public class Account {
	
	public String email;
	private String password;
	public Notification_center nc;//has a relationship
	public Inbox in;//has a relationship
	
	//We can create an account in two ways: either using email and password or using them both in addition to notification center and inbox thus we have two constructors
	public Account(String email, String password) {
		this.email = email;
		this.password = password;
		}
	
	public Account(String email, String password, Notification_center nc, Inbox in) {
		this.email = email;
		this.password = password;
		this.nc = nc;
		this.in = in;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String pass) {
		password = pass;
	}
	
	public boolean authenticate(String email, String pass) {
		if(this.password.toUpperCase().equals(pass.toUpperCase()) && this.email.toUpperCase().equals(email.toUpperCase()) )
			return true;
		else return false;
	}
        

@Override
public String toString() {
	
	return "| Email: " + email + "| Password: " + password;
}
}
