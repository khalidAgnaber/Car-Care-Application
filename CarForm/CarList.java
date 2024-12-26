package CarForm;
import Exception.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;


public class CarList {

    public ArrayList<Car> car;
    
    //constructor
   public CarList(){
	   car = new ArrayList<>();
   }
   
    public void addCar(Car c) {
        car.add(c);
    }

    public void removeCar(Car c) {
        car.remove(c);
    }
    
    public List<Car> SearchForAvailableCars (){
    ListIterator<Car> iter = car.listIterator();
    List <Car> AvailableCars= new ArrayList<>();
    while(iter.hasNext()){
        Car c = iter.next();
        if(c.getStatus()){
            AvailableCars.add(c);
        }
    }
        return AvailableCars;         
 }
    
    public List<Car> SearchForNonAvailableCars (){
    ListIterator<Car> iter = car.listIterator();
    List <Car> NonAvailableCars= new ArrayList<>();
    while(iter.hasNext()){
        Car c = iter.next();
        if(!c.getStatus()){
            NonAvailableCars.add(c);
        }
    }
        return NonAvailableCars;          
 }
    
        
 public Car searchForCarByModel(String model) throws CarNotFoundException {
    ListIterator<Car> iter = car.listIterator();

    while (iter.hasNext()) {
        Car c = iter.next();
        if (c.getModel().equals(model)) {
            return c;
        }
    }

    throw new CarNotFoundException("Car with model '" + model + "' not found");
}
 

    
public void sortCarsByYear() {
   Collections.sort(car);
}
@Override
public String toString(){
    if (car.isEmpty()){ 
        return "No cars";
    }
    ListIterator<Car> iter = car.listIterator();
    String str =" ";
    while(iter.hasNext()){
        Car car = iter.next();
        str = str + car.toString() + "\n";
      }

    return str;
}

}