package CarForm;

import Exception.CarNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class FormList {
    public ArrayList<Form> forms;
    
    public FormList(){
        forms = new ArrayList<>();
    }
    
    public void addForm(Form form){
        forms.add(form);
    }
    
    public void deleteForm(Form form){
        forms.remove(form);
    }
        
    public List<Form> searchForFormsByCarModel (String model){
        ListIterator<Form> iter = forms.listIterator();
        List<Form> formsWith_model_cars = new ArrayList<>();
        while(iter.hasNext()){
            Form form = iter.next();
            if(form.getC().getModel().equals(model)){
                formsWith_model_cars.add(form);
            }
        }
        return formsWith_model_cars;
    }
    
    
    public Form searchForFormByCarModel (String model) throws CarNotFoundException {
        ListIterator<Form> iter = forms.listIterator();
        while(iter.hasNext()){
            Form form = iter.next();
            if(form.getC().getModel().equals(model)){
                return form;
            }
        }
        throw new CarNotFoundException("Car with model '" + model + "' not found");
    }
    
    public void sortForms(){
        Collections.sort(forms);
    }
      
    @Override
    public String toString(){
    if (forms.isEmpty()){ 
        return "No Forms";
    }
    ListIterator<Form> iter = forms.listIterator();
    String str =" ";
    while(iter.hasNext()){
        Form form = iter.next();
        str = str + form.toString() + "\n";
      }

    return str;
}
}