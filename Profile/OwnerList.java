package Profile;

import Exception.*;
public class OwnerList {

		
		public static Owner owners[];
		
		public OwnerList()
		{
		
			owners = new Owner[4];
			Account ac= new Account("khalidag", "khalid123");
			owners[0] = new Owner("khalid", "agnaber", 20, "student", "casa", ac);
		}
		
		//we check if the new input is already existing 
		public void register(Owner o) throws UserAlreadyExistsException
		{
			for(Owner owner : owners)
			{
				if(o.equals(owner))
				{
					UserAlreadyExistsException e = new UserAlreadyExistsException(o);
					throw e;
				}
			}
			
			owners[1] = o;
		}
		

	}