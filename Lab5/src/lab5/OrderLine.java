package lab5;

/**
 *
 */
public class OrderLine {

    private int number;
    private double qty;
    //Additional attribute to establish the aggregation with Product
    private Product theProduct;

    public int getNumber() {
        return number;
    }

    public double getQty() {
        return qty;
    }

    public int getProductID() {
        return theProduct.getID();
    }

    public String getProductDescription() {
        return theProduct.getDescription();
    }

    public double getProductUnitPrice() {
        return theProduct.getUnitPrice();
    }

    public OrderLine(double qty, int number, Product theProduct) {
        this.number = number;
        this.qty = qty;
        this.theProduct = theProduct;
    }
}
