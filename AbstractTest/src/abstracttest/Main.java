package abstracttest;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Shape shape1 = new Shape();
        Square square1 = new Square();
        System.out.println(square1.toString());
        System.out.println(square1.getArea(2));
    }
    
}
