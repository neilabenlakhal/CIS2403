
package bankingapp;

/**
 *
 */
public class Account {
    private String name;
    private String accNumber;
    private double balance;
    
    public void deposite(double money){
        
    }
    public void withdraw(double money){
        
    }
    public boolean transfer(double money, String to){
        return false;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAccNumber(){
        return this.accNumber;
    }
    public void setAccNumber(String accNumber){
        this.accNumber = accNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public Account(){
        
    }
    public Account(String name, String accNumber){
        this.name = name;
        this.accNumber = accNumber;
        this.balance = 0;
    }
}
