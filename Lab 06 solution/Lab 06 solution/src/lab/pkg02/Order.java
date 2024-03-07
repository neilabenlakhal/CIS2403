/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02;
import java.util.ArrayList; //Task 3

/**
 *
 */
public class Order {  //Lab 04 Part 2 Task 2 and Task 3
    private String number;
    private String status;
    private String date;
    private Customer orderer; //Task 2
    private ArrayList<Product> cart; //Task 3
    
    public Order(){cart = new ArrayList<Product>();}
    
    public Order(String number, String status, String date, Customer orderer){
        this.number = number;
        this.status = status;
        this.date = date;
        this.setOrderer(orderer); //Task 2
        cart = new ArrayList<Product>(); //Task 3
    }
    
    public void addToCart(Product p){ //Task 3
        this.cart.add(p);
    }
    
    public void removeFromCart(Product p){ // Task 3
        if(!this.cart.isEmpty())
            this.cart.remove(p);
    }
    
    public void updateStatusToDelivered(){
        this.status = "Delivered";
    }
    
    public String toString(){
        return "\nNumber: "+this.getNumber()+"\nStatus: "+this.getStatus();
    }
    
    public void display(){
        System.out.println(this.toString());
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String date) {
        this.date = date;
    }    

    public Customer getOrderer() { //Task 2
        return orderer;
    }

    public void setOrderer(Customer orderer) {  //Task 2
        this.orderer = orderer;
    }
}
