package Profile;
import CarForm.*;

public class Owner extends User{
		
	public int car_price;
		public int choice;
		public CarList cc;
		
		public Owner(String f_name, String l_name, int age, String profession, String address, Account ab, CarList cc){
		super(f_name, l_name, age, profession, address, ab);
		this.cc = cc;
		}
		
		public Owner(String f_name, String l_name, int age, String profession, String address, Account ab){
			super(f_name, l_name, age, profession, address, ab);
			
			}
		
		public void update_price(int price) {
			car_price = price;
		}
		
		public void approve_refuse_request(int c){
			if(c == 1)
				 System.out.println("The request was approved");
			else System.out.println("The request was declined");
		}
		
		@Override
		public String toString() {
			return super.toString() + " Car price: " + car_price + "| choice: " + choice ;
			
	
		}
}
