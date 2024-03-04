package carengine;

/**
 *
 */
public class Engine {
    private int engineSerialNumber;
    private String brand;
            
            
    public int getEngineSerialNumber(){
        return engineSerialNumber;
    }
    
      public String getBrand(){
        return brand;
    }
    
    
    
    public Engine(int engineSerialNumber, String brand){
        this.engineSerialNumber = engineSerialNumber;
        this.brand = brand;
    }
}
