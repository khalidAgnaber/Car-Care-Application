package Profile;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class RatingComment {

	public String comment;
	public GregorianCalendar date_time;
	public Rating r;
	public Renter ren;
	public Owner ow;
	public int ra;

	ArrayList<Owner> m = new ArrayList<>(); 
	
	public RatingComment(Rating r, String comment, GregorianCalendar date_time, Renter ren, Owner ow) {
		this.r = r;
		this.comment = comment;
		this.date_time = date_time;
		this.ren = ren;
		this.ow = ow;
	}
	
	public void Rate() {
		//The printing statement that contains: enter your rating from 1 to 5 should be in the main function
		if(ra==Rating.POOR.value) r = Rating.POOR;
		else if(ra==Rating.UNSATISFACTORY.value) r = Rating.UNSATISFACTORY;
		else if(ra==Rating.SATISFACTORY.value) r = Rating.SATISFACTORY;
		else if(ra==Rating.VERY_SATISFACTORY.value) r = Rating.VERY_SATISFACTORY;
		else if(ra==Rating.OUTSTANDING.value) r = Rating.OUTSTANDING;
		else System.out.println("Please enter a valid number ");
}

	@Override
	public String toString() {
		return "Comment: " + comment + "| Date and time: " + date_time.getTime() + "| Rating: " + r + "| Renter: "+ ren + "| Owner: " + ow;
	}
}