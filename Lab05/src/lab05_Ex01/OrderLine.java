package lab05_Ex01;

/**
 *
 *
 */
public class OrderLine {

    private int number;
    private double qty;
    private Product theProduct;

    public OrderLine(int number, double qty, Product theProduct) {
        this.number = number;
        this.qty = qty;
        this.theProduct = theProduct;
    }

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
}
