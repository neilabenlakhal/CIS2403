
package hct.ae.w2_1;

/**
 *
 * @author nlakhal
 */
public class Product {

    // attributes Data members
    private String code;   //getCode setCode
    private double price; //getPrice   setPrice
    private int stock;  //getStock   setStock

    public void checkAvaiability() {
        if (stock <= 0) {
            System.out.println("No stock avaialable for this product");
        } else {
            System.out.println("Great news, some stock is still available !");
        }

    }

    //Accessors methods :  Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {

        this.code = code;
    }

    /* second way
     
       public void setCode(String acode){
         code=acode; //without this
     }
     
     */
    public void setPrice(double price) {

        this.price = price;
    }

    public void setStock(int stock) {

        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    //constructors
    //default
    public Product() {
    }

    //paramaterised constructor 
    public Product(String code, double price, int stock) {
        this.code = code;
        this.price = price;
        this.stock = stock;
    }

}
