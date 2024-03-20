/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exception_grade;
    import java.util.Scanner;

/**
 *
 * @author nlakhal
 */
public class Exception_grade {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for input
        System.out.println("Enter student grade: ");

        // Try to read the grade and check its value
        try {
            int grade = scanner.nextInt(); // Read user input
            // Check if the grade is out of the expected range
            if (grade < 0 || grade > 100) {
                throw new ArithmeticException("Grade is out of range. It should be between 0 and 100.");
            } else {
                System.out.println("Grade is valid: " + grade);
            }
        } catch (ArithmeticException e) {
            // Handle the case where the grade is out of bounds
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}

    

