package Exception;

@SuppressWarnings("serial")

//exception when the user enters a negative integer in the age attribute
public class InvalidInputException extends Exception{
	
		public InvalidInputException()
		{	
			super("The input you entered is invalid, please enter a positive integer");
		}

	}