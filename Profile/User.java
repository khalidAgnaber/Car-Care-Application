package Profile;

public class User {

	public String f_name;
	public String l_name;
	public int age;
	public String profession;
	public String address;
	public Account a1;
		
	public User(String f_name,String l_name, int age, String profession, String address, Account aa) {
		this.f_name = f_name;
		this.l_name = l_name;
		this.age = age;
		this.profession = profession;
		this.address = address;
		a1 = aa;
	}
	
	public void updateinfo(String f_name, String l_name, int age, String profession, String address, Account aa) {
		this.f_name = f_name;
		this.l_name = l_name;
		this.age = age;
		this.profession = profession;
		this.address = address;
		a1 = aa;
		System.out.println("The information has been updated");
	}

	@Override
	public String toString() {
		
		return "Name: " + f_name + " " + l_name  +"| Age: " + age +"| Profession: " + profession +"| Address: " + address + a1;
	}
}
