/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02;

/**
 *
 */
public class Product {
    protected String code;
    protected double price;
    protected int stock;
    protected double vat;
    
    public Product(){}
    
    public Product(String code, double price, int stock, double vat){
        this.code = code;
        this.price = price;
        this.stock = stock;
        this.vat = vat;
        
        //EXTRA TASK: add extra attributes to the class product such as description, name, define setters & getters and update the toString method
    }
    
    public String checkAvailability(){
        if(this.stock > 0)
            return "In stock";
        else
            return "Out of stock";
    }
    
    public double CalculateRetailPrice(){
        return (price+price*vat);
    }
    
    public String toString(){
        return "\nCode: "+this.getCode()+"\nPrice: "+this.getPrice()+
                "\nAvailability: "+this.checkAvailability()+
                "\nRetail price: "+this.CalculateRetailPrice();
    }
    
    public void display(){
        System.out.println(this.toString());
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    } 

    public double getVat() {
        return vat;
    }

    public void setVat(double vat) {
        this.vat = vat;
    }    
}
