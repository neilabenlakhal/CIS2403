/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankingapp;

/**
 *
 */
public class BankingApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Account acc1 = new Account("Samer", "0123-4567");
        Account acc2 = new Account("Amal", "0123-4568");
        System.out.println(acc2.transfer(12, "Samer"));
    }
    
}
