/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.gpaappoop;

/**
 *Why should we make  attributes private?


    Encapsulation:
        Think of a class like a treasure chest, and its attributes are the treasures inside.
        Making attributes private is like putting a lock on the chest. It keeps the treasures safe and secure.
        This is called encapsulation – bundling the data (attributes) and the methods (functions) that operate on the data together.

    Controlled Access:
        If everyone can directly access and modify the treasures in the chest, chaos might ensue.
        Making attributes private allows us to control how and when the data inside the class can be accessed or changed.
        We create specific doors (methods) to interact with the treasures. These doors can check who's knocking and decide whether to allow or deny access.

    Preventing Accidents:
        Imagine if anyone could freely change the color of a car's paint without any rules.
        By making attributes private, we set rules (methods) for modifying or retrieving the data. This helps prevent accidental changes and ensures that modifications follow certain conditions or checks.

    Adaptability:
        If we decide to change how something works inside the chest, like the way we calculate the value of a treasure, we can do that without affecting the outside world.
        Private attributes allow us to make changes internally without breaking the code that relies on the class.
 * 
 * 
 * 
 * @author nlakhal
 */
public class Student {
    // Attributes
    public String id;
    public String name;
    public String major;
    public double gpa;

    // Method to convert GPA to Grade
    public String gpaToGrade() {
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