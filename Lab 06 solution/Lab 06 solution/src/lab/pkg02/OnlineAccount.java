/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg02;

/**
 *
 */
public class OnlineAccount { //Lab 06 Part 2 Task 1
    
    private String username;
    private String password;
    private int loyaltyPoints;
    private String joiningDate;
    private Customer owner;
    
    public OnlineAccount(){}
    
    public OnlineAccount(String username, String password, int loyaltyPoints,String joiningDate, Customer owner){
        this.setJoiningDate(joiningDate);
        this.setLoyaltyPoints(loyaltyPoints);
        this.setOwner(owner);
        this.setPassword(password);
        this.setUsername(username);
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public String getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }
    
    
    
    
    
    
    
}
