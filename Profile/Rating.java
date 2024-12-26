package Profile;

public enum Rating {
	POOR(1),
	UNSATISFACTORY(2),
	SATISFACTORY(3),
	VERY_SATISFACTORY(4),
	OUTSTANDING(5);
	
public int value;

Rating(int value){
	this.value= value;
}

}