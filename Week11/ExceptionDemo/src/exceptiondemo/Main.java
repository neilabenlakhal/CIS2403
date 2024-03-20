package exceptiondemo;

import java.util.Scanner;

/**
 *
 * @author mwannous
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ArithmeticException{
        Scanner input = new Scanner(System.in);
        System.out.println("Type your GPA (0-4): ");
        double gpa = input.nextDouble();
        if(gpa < 0.0 || gpa > 4.0 ){
            throw new ArithmeticException("Your GPA is " + gpa + ". I told you that GPA should be between 0 and 4!");
        } else {
            if(gpa  < 1.0){
                System.out.println("Your grade is D");
            } else if (gpa < 2.0){
                System.out.println("Your grade is C");
            } else if (gpa < 3.0){
                System.out.println("Your grade is B");
            } else {
                System.out.println("A");
            }
        }
    }
    
}
