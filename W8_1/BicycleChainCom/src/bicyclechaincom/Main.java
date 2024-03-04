package bicyclechaincom;

/**
 *
 * @author mwannous
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle("Yellow", "Mountain", 12.5);
        System.out.println("Bicycle details");
        System.out.println("Color: " + myBike.getColor());
        System.out.println("Type: " + myBike.getType());
        System.out.println("Chain Length:" + myBike.getChainLength());
    }

}
