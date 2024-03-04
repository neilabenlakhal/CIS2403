package lab05_Ex02;


/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chain c= new Chain();
        c.setLength(10);
        Chain c1= new Chain(10);
        Bicycle myBike = new Bicycle("Yellow", "Mountain", c);
    //    myBike.getBicChain().setLength(10);
        System.out.println("Bicycle details");
        System.out.println("Color: " + myBike.getColor());
        System.out.println("Type: " + myBike.getType());
        System.out.println("Chain Length:" + myBike.getChainLength());
    }

}
