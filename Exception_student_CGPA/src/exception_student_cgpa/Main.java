/*

 
Create a student class with a private attribute CGPA,  a name and student ID
Check the student CGPA : 
if the CGPA is less than 0 or more than 4.0 throw ArithmeticException in the setter
if the CGPA is less than 0 or more than 4.0 throw InputMismatchException in the parameterized exception

In the main class, create  2 students s1 and s2, 
use the parameterized constructor in s1
use  the  default constructor and the the setter in s2 

*/
package exception_student_cgpa;

import java.util.InputMismatchException;

/**
 *
 * @author nlakhal
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create first student using the parameterized constructor
        try {
            Student s1 = new Student("Alice", "S123", 13.5); //parameterized
            System.out.println("Student 1 created with CGPA: " + s1.getCGPA());
        } catch (InputMismatchException e) {
            System.out.println("Failed to create Student 1: " + e.getMessage());
        }

        // Create second student using default constructor and setters
        Student s2 = new Student();
         s2.setName("sara");
         s2.setStudentID("S456");
        try {
            s2.setCGPA(-3.8); // Try changing this value to see how the exception is handled
            System.out.println("Student 2 created with CGPA: " + s2.getCGPA());
        } catch (ArithmeticException e) {
            System.out.println("Failed to set CGPA for Student 2: " + e.getMessage());
        }
    }
}
