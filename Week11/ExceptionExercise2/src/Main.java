
import java.util.InputMismatchException;  // import package
import java.util.Scanner;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type the reward amount in AED: ");
        double award = scan.nextDouble();
        System.out.print("Type the number of winners: ");
        int nrWinners = scan.nextInt();
        double share = award / nrWinners;
        System.out.println("Each winner receives " + share + " AED");
    }

    
    
    //with exception handling
    
    public static void main2(String[] args) {

        
            Scanner scan = new Scanner(System.in);
            System.out.println("Type the reward amount in AED");
            double award = scan.nextDouble();
            System.out.println("Type the number of winners");
            int nrWinners = scan.nextInt();
            
      try {
          //Define a Try block and write the statement (that might cause an error) inside it.
            double share = award / nrWinners;
            System.out.println("Each winner receives " + share + " AED");
        } catch (InputMismatchException e) {
            System.out.println("exception : please enter an integer ");
             System.out.println("exception message: " + e.toString());
        }

    }

}
