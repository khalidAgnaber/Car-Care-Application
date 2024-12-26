package CarCareApp;
import java.util.Scanner;
import Exception.*;
import CarForm.*;
import Profile.*;
import java.util.List;
public class CarCareApp {


	public static void main(String[] args)throws InvalidInputException {
                
        CarList ownercars = new CarList();
        FormList renterforms = new FormList();
		Scanner input = new Scanner(System.in);

		System.out.println("Welcome to the CarCare main app");
                    

		System.out.println("Please enter your first name:");
		String f_name = input.nextLine();
		System.out.println("Please enter your last name:");
		String l_name = input.nextLine();
		System.out.println("Please enter the age:");
		int age = input.nextInt();
		if (age<0) {
			InvalidInputException i = new InvalidInputException();
			throw i;
		}
		System.out.println("Please enter the profession :");
		String profession = input.next();
		System.out.println("Please enter the address :");
		String address = input.next();
		System.out.println("Please enter the email :");
		String email = input.next();
		System.out.println("Please enter the password :");
		String password = input.next();
		Account a1 = new Account(email, password);
                int choice;
                int choice2;
                do{
                 
                System.out.println("""
                                   
                                   1- Renter
                                   2- Owner
                                   0- Exit
                                   Note: Please create an owner first to have cars for the renter to see""");
                choice = input.nextInt();
                
           
                if(choice ==1){
                    
                    do{
                    Renter r = new Renter(f_name, l_name, age, profession, address, a1);
                    System.out.println("1- Fill Form \n2- Delete Form \n3- Sort Forms Alphabetically \n4- Search Forms By Model \n5- Look at Forms \n0-Exit ");
                    choice2 = input.nextInt();
                    if(choice2==0){
                        System.out.println("GoodBye Renter!");
                    }
                    if(choice2==1){
                        System.out.println("Please enter the following:");
                        System.out.println("Please enter the duration of usage (in days)");
                        int duration = input.nextInt();
                        System.out.println("Please enter the use of the car");
                        String reason = input.next();
                        
                        boolean foundCarcond = false;
                        System.out.println("Please select from the following cars by model");
                        System.out.println(ownercars.toString());                        
                            while (!foundCarcond) {
                                String model = input.next();
                                try {
                                    Car foundCar = ownercars.searchForCarByModel(model);
                                    Form f = new Form(duration,reason,foundCar,r);
                                    renterforms.addForm(f);
                                    System.out.println("Car found: " + foundCar);
                                    foundCarcond = true;
                                } catch (CarNotFoundException ex) {
                                    System.out.println("This model does not exist, please pick a model that does");
                                }
                                
                            }
                    }

                        
                    if(choice2==2){
                        boolean foundCarcond = false;
                        System.out.println("Please select the form you want to delete by putting in the model it has");
                        System.out.println(renterforms.toString());                        
                            while (!foundCarcond) {
                                String model = input.next();
                                try {
                                    Form foundForm = renterforms.searchForFormByCarModel(model);
                                    renterforms.deleteForm(foundForm);
                                    System.out.println("Form found: " + foundForm);
                                    foundCarcond = true;
                                } catch (CarNotFoundException ex) {
                                    System.out.println("This model does not exist, please pick a model that does");
                                }
                        
                    }     
                    }
                    if(choice2==3){
                        renterforms.sortForms();
                    }
                    if(choice2==4){
                        System.out.println("Please enter the model that you want to see in your forms");
                        String model = input.next();
                        List forms = renterforms.searchForFormsByCarModel(model);
                       
                            System.out.println(forms.toString());
                        
                    }
                    
                    
                    if(choice2==5){
                        System.out.println(renterforms.toString());
                    }
                    
                    }while(choice2!=0);
                    
                	}
                
                	if(choice == 2){
                    Owner o1 = new Owner(f_name, l_name, age, profession, address, a1);
                    //Owner already has some cars
                    Car car1 = new Car("Sedan", "ModelX", 2020, "Tesla", "Automatic", 4, false, o1);
                    Car car2 = new Car("SUV", "RAV4", 2019, "Toyota", "Automatic", 4, true, o1);
                    Car car3 = new Car("Hatchback", "Golf", 2022, "Volkswagen", "Manual", 5, false, o1);
                    
                   
                    ownercars.addCar(car1);
                    ownercars.addCar(car2);
                    ownercars.addCar(car3);
                    int choice3;
                    System.out.println("Pick from the following menu:");
                    do{
                        System.out.println("1-Add car (visible by default)");
                        System.out.println("2-Remove car");
                        System.out.println("3-Hide/Unhide a specific car");
                        System.out.println("4-Display non-hidden cars");
                        System.out.println("5-Display hidden cars");
                        System.out.println("6-Display my cars");
                        System.out.println("7-Sort my cars by years");
                        System.out.println("0-Exit");
                        choice3 = input.nextInt();
                        if(choice3==1){
                            System.out.println("Please enter the type :");
                            String type = input.next();
                            System.out.println("Please enter the model :");
                            String model = input.next();
                            System.out.println("Please enter the year :");
                            int year = input.nextInt();
                            System.out.println("Please enter the make :");
                            String make = input.next();
                            System.out.println("Please enter the gearbox type :");
                            String gearbox_type = input.next();
                            System.out.println("Please enter the number of doors :");
                            int n = input.nextInt();
                            Car c = new Car(type, model, year, make, gearbox_type, n, false, o1);
                            ownercars.addCar(c);
                        }
                        if(choice3==2){
                            boolean foundCarcond = false;
                            System.out.println("Please pick the model of car you want to delete");
                            
                            while (!foundCarcond) {
                                String model = input.next();
                                try {
                                    Car foundCar = ownercars.searchForCarByModel(model);
                                    System.out.println("Car found: " + foundCar);
                                    ownercars.removeCar(foundCar);
                                    System.out.println("Car Removed Successfully");
                                    foundCarcond = true;
                                } catch (CarNotFoundException ex) {
                                    System.out.println("This model does not exist, please pick a model from the following: \n"+ownercars.toString());
                                }
                            }

                      }   
                        if(choice3==3){
                            boolean foundCarcond = false;
                            System.out.println("Please pick the model of car you want to hide/unhide");                         
                            while (!foundCarcond) {
                                String model = input.next();
                                try {
                                    Car foundCar = ownercars.searchForCarByModel(model);
                                    System.out.println("Car found: " + foundCar);
                                    System.out.println("Do you want to hide or unhide the car?\n 1- Hide\n 2-  Unhide");
                                    int choice4 = input.nextInt();
                                    if(choice4==1){
                                    foundCar.setHiddenstatus(true);
                                }
                               
                                    else if(choice4==1){
                                    foundCar.setHiddenstatus(false);
                                }
                                    else{
                                        System.out.println("invalid input");
                                    }
                                    foundCarcond = true;
                                } catch (CarNotFoundException ex) {
                                    System.out.println("This model does not exist, please pick an available model");
                                }    
                                
                        
                            }}
                        if(choice3==4){
                            System.out.println("Your non-hidden cars are");
                            List non_hidden = ownercars.SearchForNonAvailableCars();
                            System.out.println(non_hidden.toString());
                        }
                        if(choice3==5){
                            System.out.println("Your hidden cars are");
                            List non_hidden = ownercars.SearchForAvailableCars();
                            System.out.println(non_hidden.toString());
                        }
                        if(choice3==6){
                            System.out.println(ownercars.toString());
                        }
                        if(choice3==7){
                            ownercars.sortCarsByYear();
                        }
                        if(choice3==0){
                            System.out.println("Goodbye Owner!");
                        }
                        
                    }while(choice3 !=0);

                }}while(choice!=0);}}