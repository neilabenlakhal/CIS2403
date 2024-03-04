package carengine;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Car c1 = new Car("Honda", 2024, 123456, "Suzuki");
        System.out.println("Car Details");
        System.out.println("Make: " + c1.getMake());
        System.out.println("Year: " + c1.getYear());
        System.out.println("Engine Serial Number: " + c1.getEngineSerialNumber());
        System.out.println("the Engine brand is : "+ c1.getBrand());
        c1 = null;
      // System.out.println("After deleting the car: " + c1.getEngineSerialNumber());
    }
    
}
