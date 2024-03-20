
import java.util.InputMismatchException; //step 1

/**
 * Change below code : if the maxSpeed is less than 0 or greater than 300 throw a inputMismatch exception:
 * 1- throw exception in the setter
 * 2- throw exception in the parameterized constructor
 */
public class Car {

    private int maxSpeed;

    public Car() {
    }

    
    public int getMaxSpeed() {
        return maxSpeed;
    }

 //   public Car(int maxSpeed) {
 //       this.maxSpeed = maxSpeed;
  //  }

   // public void setMaxSpeed(int maxSpeed) {

   //     this.maxSpeed = maxSpeed;
  // }

     //1- exception in the setter
    public void setMaxSpeed(int maxSpeed) throws InputMismatchException{ //step 2
        if(0 > maxSpeed || maxSpeed >= 300){
            throw new InputMismatchException("maxSpeed is a positive number less than 300!");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
   
    // 2- Parameterized constructor that checks maxSpeed value
    public Car(int maxSpeed) throws InputMismatchException { //step 2
        if (maxSpeed < 0 || maxSpeed > 300) {
            throw new InputMismatchException("maxSpeed must be a positive number less than or equal to 300!");
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
     
}
