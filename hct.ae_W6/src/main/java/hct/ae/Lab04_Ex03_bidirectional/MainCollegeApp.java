/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.Lab04_Ex03_bidirectional;

/**
 *
 * @author neila
 */
public class MainCollegeApp {
    public static void main(String[] args) {
        // Create students
        Student alia = new Student("S1", "Alia");
        Student sarra = new Student("S2", "Sarra");
        Student mariam = new Student("S3", "Mariam");
        Student nour = new Student("S4", "Nour");

        // Create a course
        Course cis2403 = new Course("CIS2403", "Advanced Java Programming");

        // Register students in the course
        cis2403.addStudent(alia);
        cis2403.addStudent(sarra);
        cis2403.addStudent(mariam);
        cis2403.addStudent(nour);

        // Display registered students for the course
        cis2403.displayRegisteredStudents();
    }
}
