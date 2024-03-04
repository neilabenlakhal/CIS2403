package lab5;

/**
 *
 * @author mwannous
 */
public class Product {
    private int ID;
    private String description;
    private double unitPrice;
    
    public int getID() {
        return ID;
    }
    public String getDescription(){
        return description;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public Product(int ID, String description, double unitPrice){
        this.ID = ID;
        this.description = description;
        this.unitPrice = unitPrice;
    }
}
