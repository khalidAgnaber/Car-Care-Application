package Profile;

public class Renter extends User {

		public Renter(String f_name, String l_name, int age, String profession, String address, Account a) {
			super(f_name, l_name, age, profession, address, a);
		}
		
		public void view_top_rated_owners() {
			// we will add the top_rated_owners to a collection later
		}
		
		public void rent_request() {
			System.out.println("Dear owner, I want to rent your car");
		}
		
		@Override
		public String toString() {
			return super.toString();
		}
}
