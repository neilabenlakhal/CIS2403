/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package hct.ae.gpaappprocedural;

import java.util.Scanner;

/**
 *
 * @author nlakhal
 */
public class GpaAppProcedural {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student Major: ");
        String studentMajor = scanner.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        String grade = gpaToGrade(gpa);

        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Major: " + studentMajor);
        System.out.println("GPA: " + gpa);
        System.out.println("Grade: " + grade);

    }

    static String gpaToGrade(double gpa) {
        if (gpa >= 3.75) {
            return "A";
        } else if (gpa >= 3.5) {
            return "A-";
        } else if (gpa >= 3.25) {
            return "B+";
        } else if (gpa >= 3.0) {
            return "B";
        } else if (gpa >= 2.75) {
            return "B-";
        } else if (gpa >= 2.0) {
            return "C";
        } else if (gpa >= 0.0) {
            return "F";
        } else {
            return "Invalid GPA";
        }
    }
}

    