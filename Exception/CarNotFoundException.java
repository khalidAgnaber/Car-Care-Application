package Exception;
@SuppressWarnings("serial")
public class CarNotFoundException extends Exception {
    public CarNotFoundException(String message) {
        super(message);
    }
    public String RecoverFromError(){
       return "Please enter an existing model.";
    }
}