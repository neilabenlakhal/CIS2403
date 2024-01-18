/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package hct.ae.gpaappoop;

import java.util.Scanner;

/**
 *
 * @author nlakhal
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student s1 = new Student("H0054", "Ahmad", "CIS", 3.2); //call
        
        Student s3 = new Student ("H0049114", "hend", "CIS", 4.0);
        
        Student s4= new Student ("h00000", "Neila", "CIS", 3.5);
        
        String name = "hend";
        

        s1.display();

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student Major: ");
        String studentMajor = scanner.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        // Create a second Student object
        Student s2 = new Student();
        s2.setId(studentId);
        s2.setName(studentName);
        s2.setMajor(studentMajor);
        s2.setGpa(gpa);

        // Display student details and grade
        System.out.println("\nStudent Details:");
        s2.display();

    }
}
