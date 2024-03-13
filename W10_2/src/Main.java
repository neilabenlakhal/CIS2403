/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Electronics e12 = new Electronics ("E11", 4.5, 45, 1.4, "MACOS", "removable");
        e12.display();
        
        //Lab 06 step 5 and 6
        
        Electronics e1 = new Electronics("E101-Phone", 2500.0, 32,0.05,"Android OS", "Lithium");
        
        Clothing c1 = new Clothing("C100-Shirt", 78.5, 140, 0.05, "Medium", "Polyester");
        
        // notice that there is no display method in class Clothing or Electronics
        // Find out which toStirng method was invoked by the Display method for each instance
        
        e1.display();
        
        c1.display(); 
        
    }
}
