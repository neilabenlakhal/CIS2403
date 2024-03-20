
/**
 *
 * @author mwannous
 */
import java.util.InputMismatchException;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Cycle c1 = new Cycle();
            c1.setNrTyres(-1);
        } catch (InputMismatchException ime) {
            System.out.println(ime.getMessage());
        }
    }
}
