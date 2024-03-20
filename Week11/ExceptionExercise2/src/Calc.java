
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 */
public class Calc {

    public void calculateShare() {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Type the reward amount in AED");
            double award = scan.nextDouble();
            System.out.println("Type the number of winners");
            int nrWinners = scan.nextInt();
            double share = award / nrWinners;
            System.out.println("Each winner receives " + share + " AED");
        } catch (InputMismatchException hessa) {
            System.out.println("Error");
        }
    }
}
