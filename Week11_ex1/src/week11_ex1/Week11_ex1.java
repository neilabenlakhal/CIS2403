/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week11_ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author nlakhal
 */
public class Week11_ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
System.out.println("Enter the award amount in AED: \n");
double award = input.nextDouble();
System.out.println("Enter the number of participants: \n");
try {
    int participants = input.nextInt();
double share = award / participants;
System.out.println("Each participant receives " + share + " AED. \n");
        
}     

catch(InputMismatchException e){
System.out.println("Exception: "+e.toString());
System.out.println("un exception has happened");
}

finally {
            System.out.println("Process complete");
        }
    }
    
}
