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

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String studentName = scanner.nextLine();

        System.out.print("Enter Student Major: ");
        String studentMajor = scanner.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        // Create a Student object
        Student student = new Student();
        student.id = studentId;
        student.name = studentName;
        student.major = studentMajor;
        student.gpa = gpa;

        // Display student details and grade
        System.out.println("\nStudent Details:");
        System.out.println("Student ID: " + student.id);
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Major: " + student.major);
        System.out.println("GPA: " + student.gpa);
        System.out.println("Grade: " + student.gpaToGrade());

    }
}

