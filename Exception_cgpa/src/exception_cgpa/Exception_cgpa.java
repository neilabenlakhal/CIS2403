/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception_cgpa;

import java.util.Scanner;

/**
 *
 * @author nlakhal
 */
public class Exception_cgpa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input
        System.out.println("Enter student GPA: ");

        // Try to read the GPA and check its value
        try {
            double gpa = scanner.nextDouble(); // Read user input
            // Check if the GPA is out of the expected range
            if (gpa < 0.0 || gpa > 4.0) {
                throw new ArithmeticException("GPA is out of range. It should be between 0 and 4.");
            } else {
                System.out.println("GPA is valid: " + gpa);
            }
        } catch (ArithmeticException e) {
            // Handle the case where the GPA is out of bounds
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner
        }
    }
    
}
