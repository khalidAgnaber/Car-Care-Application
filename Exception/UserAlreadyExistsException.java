package Exception;
import Profile.*;

@SuppressWarnings("serial")

public class UserAlreadyExistsException extends Exception{

		public User user_e;
		
		public UserAlreadyExistsException(User user_e)
		{
			
			super("The username you have entered: " +user_e+ " is already existing");
			this.user_e = user_e;
			
		}
		
		public String[] fullName()
		{
			
			String name_e [] = new String[2];
			
			
			name_e[0] = user_e.l_name + "_" + user_e.f_name;
			name_e[1] = user_e.f_name + "_" + user_e.l_name;
			
			
			return name_e;
		}

	}