package CarForm;
import Profile.Renter;
public class Form implements Comparable<Form>{

	public int duration_in_days;
	public String use_of_car;
	public Car c;
    public Renter r;

    public Form(int duration_in_days, String use_of_car, Car c, Renter r) {
        this.duration_in_days = duration_in_days;
        this.use_of_car = use_of_car;
        this.c = c;
        this.r = r;
    }
        
    public void setDuration_in_days(int duration_in_days) {
        this.duration_in_days = duration_in_days;
    }

    public void setUse_of_car(String use_of_car) {
        this.use_of_car = use_of_car;
    }

    public void setC(Car c) {
        this.c = c;
    }

    public void setR(Renter r) {
        this.r = r;
    }

    public int getDuration_in_days() {
        return duration_in_days;
    }

    public String getUse_of_car() {
        return use_of_car;
    }

    public Car getC() {
        return c;
    }

    public Renter getR() {
        return r;
    }
        
	public void fill_form(int duration, String content){ 
		this.duration_in_days = duration;
		use_of_car = content;
	}
	
	public void update_form(int duration, String content){
		this.duration_in_days = duration;
		use_of_car = content;
	}
	
	@Override
    public String toString() {
        return "The renter "+ r + "rented the car "+ c +", the duration in days is: " + duration_in_days + " and the use of car: " + use_of_car;
    }
	
    @Override
    public int compareTo(Form o) {
        if(this.c.model.compareTo(o.c.model)>1){
            return 1;
        }
        else{
            return -1;
        }
    }


	
}