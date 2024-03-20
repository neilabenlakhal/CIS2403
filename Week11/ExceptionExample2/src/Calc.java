
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 */
public class Calc {

    public void calculateShare() {
        while (true) {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("Type the award amount in AED");
                double award = keyboard.nextDouble();
                System.out.println("Type the number of winners");
                int nrWinners = keyboard.nextInt();
                double share = award / nrWinners;
                System.out.println("Each winner receives: " + share + " AED");
            } catch (InputMismatchException ime) {
                System.out.println("Error! " + ime.getMessage());
            }
        }
    }
}
