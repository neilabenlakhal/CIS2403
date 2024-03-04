package lab05_Ex01;

/**
 *
 * @author mwannous
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1 = new Product(15, "A ball pen", 1.5);
         //Create an object of OrderLine and establish the aggregation
        //through the constructor.
        OrderLine o1 = new OrderLine(01, 11.0, p1);
        
        System.out.println("OrderLine Details");
        System.out.println("Number: " + o1.getNumber());
        System.out.println("Qty: " + o1.getQty());
        System.out.println("ID: " + o1.getProductID()); 
        System.out.println("Description: " + o1.getProductDescription());
        System.out.println("Unit Price: " + o1.getProductUnitPrice());
        
        o1 = null;
        System.out.println("OrderLine Details");
//        System.out.println("Number: " + o1.getNumber());
//        System.out.println("Qty: " + o1.getQty());
        System.out.println("ID: " + p1.getID());
        System.out.println("Description: " + p1.getDescription());
        System.out.println("Unit Price: " + p1.getUnitPrice());
        System.out.println(p1);
    }
    
}
