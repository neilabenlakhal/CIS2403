package hct.ae.w2_1;

/**
 *
 * @author nlakhal
 */
public class Product {

    // Attributes / Data members
    private String code;   //getCode setCode
    private double price; //getPrice   setPrice
    private int stock;  //getStock   setStock
    private double vat;  //getVat setVat
    private String name; //getName setName

    public String getName()
    { return name;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }         
            
            
            
            
    
    public double getVat()
    {
        return vat;
    }
    
    public void setVat(double vat)
    {
        this.vat=vat;
    }
    
    String checkAvailability() {
        // Write a method called checkAvailability that will check the product stock and will
        //return in stock if the stock is positive, else will return out of stock     
        if (this.stock > 0) {
            return "In stock";
        } else {
            return "Out of stock";
        }
    }
   
  
      void checkAvailability2() {
          
           // Write a method called checkAvailability2 that will check the product stock and will
     //display " in stock" if the stock is positive, else will display " out of stock"
    
     if (this.stock > 0) {
            System.out.println( "In stock");
        } else {
            System.out.println( "Out of stock");
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
    public Product() { //no parameter
    }

    //paramaterised constructor 
    public Product(String code, double price, int stock, double vat, String name) {
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.vat=vat;
        this.name= name;
    }

    public double calculate_retail_price()
    {
        return price+price*vat;
        
        //return this.getPrice()+ this.getPrice()*this.getVat();
    }
   //Step 9: Define a toString method to return all the product info in a single string.
     
    /* public String toString()
    {
        return (code+price+stock);
    }
    
    */
    //step 9
    public String toString() {
        return "\nCode: " +code +"\nName: " +name+ "\nPrice: " + this.calculate_retail_price()+ "\nAvailability: " + this.checkAvailability();
    }
    
    
    //Step 10: Define a display method to print the product info.
    

    public void display() {
        System.out.println(this.toString());
    }

}
