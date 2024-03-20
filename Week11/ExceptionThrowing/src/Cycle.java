
/**
 *
 * @author mwannous
 */
import java.util.InputMismatchException;
public class Cycle {

    private int nrTyres;

    public int getNrTyres() {
        return nrTyres;
    }

    public void setNrTyres(int nrTyres) throws InputMismatchException{
        if (nrTyres >= 0 && nrTyres < 5) {
            this.nrTyres = nrTyres;
        } else {
            throw new InputMismatchException("Number of tyres should be a positive "
                    + "number less than 5!");
        }
    }
}
