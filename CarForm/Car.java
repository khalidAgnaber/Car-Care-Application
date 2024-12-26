package CarForm;
import Profile.*;
public class Car implements Comparable<Car> {

	public String model;
	public String make;
    public int year;
	public String gearbox_type;
	public int number_of_doors;
	public String type;
	public boolean hiddenstatus;
	public Owner o;
	
	public Car(String type, String model, int year, String make, String gearbox_type, int number_of_doors, boolean status, Owner o) {
		this.type = type;
		this.model = model;
        this.year = year;
		this.make = make;
		this.number_of_doors = number_of_doors;
		this.gearbox_type = gearbox_type;
		hiddenstatus = false;
		this.o = o;
		
	}

    public String getModel() {
        return model;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getGearbox_type() {
        return gearbox_type;
    }

    public int getNumber_of_doors() {
        return number_of_doors;
    }

    public String getType() {
        return type;
    }

    public boolean isHiddenstatus() {
        return hiddenstatus;
    }

    public Owner getO() {
        return o;
    }
	
	public void update_car(String type, String model, int year, String make, String gearbox_type, int number_of_doors, boolean status, Owner o) {
		this.type = type;
		this.model = model;
		this.year = year;
		this.make = make;
		this.number_of_doors = number_of_doors;
		this.gearbox_type = gearbox_type;
		hiddenstatus = false;
		this.o=o;
	}

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGearbox_type(String gearbox_type) {
        this.gearbox_type = gearbox_type;
    }

    public void setNumber_of_doors(int number_of_doors) {
        this.number_of_doors = number_of_doors;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHiddenstatus(boolean hiddenstatus) {
        this.hiddenstatus = hiddenstatus;
    }

    public void setO(Owner o) {
        this.o = o;
    }
	

	public void hide_car() {
		hiddenstatus =true;
		System.out.println("The car is hidden");
	}
        
        public boolean getStatus(){
            return hiddenstatus;
        }
	
        //We did the getters and setters even if the attributes are public because we had issues in the compareTo method
        @Override
        public int compareTo(Car otherCar) {
        if(this.year>otherCar.getYear()){
            return 1;
        }
        else{
            return -1;
        }
    }
	 @Override
	    public String toString() {
	        return "Owner: "+ o.f_name +" "+ o.l_name + "Type: " + type + "| Model: " + model + "| Year: " + year + "| Make: " + make + "| Gearbox Type: " + gearbox_type + "| Number of Doors: " + number_of_doors + "| Status: " + hiddenstatus+ "\n";
	    } 
}