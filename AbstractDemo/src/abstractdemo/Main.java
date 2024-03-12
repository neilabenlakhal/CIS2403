package abstractdemo;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //    Shape s1 = new Shape(); cannot create instance form an abstract class
        Square s2 = new Square(4.1);
        System.out.println(s2.getName());
        System.out.println(s2.calculateArea());
    }

}
