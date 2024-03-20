
/**
 *  change the main class now to handle the exception
 */
import java.util.InputMismatchException;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Car car1 = new Car(300);
        //  car1.setMaxSpeed(350);
        try {
            Car car12 = new Car(360); //default 
            car12.setMaxSpeed(360);
        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }

}
