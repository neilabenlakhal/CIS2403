/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg08;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author tkobbaey
 */
public class Lab08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        printLn("Enter the mass of the object in KG: "); // Defined a new static method called printLn below

        try {

            int mass = input.nextInt();
            printLn("Enter the Volume of the object in M\u2083");
            int volume = input.nextInt();

            double density = mass/volume;

            printLn("The Desnity of the object is : " + density);
        }
        
        catch(InputMismatchException e){
            printLn("Wrong data entered - Please enter numbers");
        }
        
        catch(ArithmeticException e){
            printLn("Volune cant be zero - division by zero is not allowed");
        }
        
        catch(Exception e){
            printLn(e.toString());
        }
        
        //Check the Exception Handling sheet attached
    }

    public static void printLn(String s) {
        System.out.println(s);
    }

}
