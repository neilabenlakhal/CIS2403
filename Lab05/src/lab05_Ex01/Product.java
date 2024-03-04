package lab05_Ex01;

/**
 *
 */
public class Product {

    private int ID;
    private String description;
    private double unitPrice;

    public Product(int ID, String description, double unitPrice) {
        this.ID = ID;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public int getID() {
        return ID;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" + "ID=" + ID + ", description=" + description + ", unitPrice=" + unitPrice + '}';
    }
}
