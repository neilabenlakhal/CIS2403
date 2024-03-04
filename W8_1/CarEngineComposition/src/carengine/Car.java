package carengine;

/**
 *
 */
public class Car {

    private String make;
    private int year;

    
    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

 
    
    //For the composition
    private Engine engine;


    
    /*Private instance variable: The Engine instance in the Car class is marked as private (private Engine engine;). 
    This means that it cannot be accessed directly from outside the Car class, 
     thus encapsulating the Engine within the Car.
     */

    
    public int getEngineSerialNumber() {
        return engine.getEngineSerialNumber();  
    }
    
    public String getBrand() {
        return engine.getBrand();  
    }
   
    // No getEngine() !
    
    
    /*Controlled access to the part object: 
    Although there is no direct getter method for the Engine object itself
    (which would allow external objects to access and possibly manipulate the Engine directly), 
    there is a method getEngineSerialNumber() in the Car class that delegates the call to the Engine. 
    This method allows external entities to 
obtain information about the Engine (in this case, its serial number)
    without having direct access to the Engine object:
    
  */  
    

    public Car(String make, int year, int engineSerialNumber, String brand) {
        this.make = make;
        this.year = year;
        this.engine = new Engine(engineSerialNumber, brand); // Composition enforced here
    }

}
