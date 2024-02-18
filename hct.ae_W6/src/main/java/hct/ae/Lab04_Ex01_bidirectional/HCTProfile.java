/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.Lab04_Ex01_bidirectional;


/**
 *
 * @author neila
 */


public class HCTProfile {

    // Custom attributes
    private int number;
    private String type;
    private String startDate;
    
    
    
    private Student student;

    public Student getStudent() {
        return student;
    }

    /**
 * Sets the address for the person, maintaining bidirectional relationship.
 * 
 * @param a The new address to be set.
 */

    
   /**
 * Sets the student for the HCTProfile, maintaining bidirectional relationship.
 * 
 */
public void setStudent(Student s) {
    // Check if the new student is different from the current associated student
    if (student != s) {
        // Update the HCTProfile's reference to the new student
        student = s;
        
        // Establish bidirectional relationship: set the HCTProfile reference in the new student
        s.setHctProfile(this);
        
    }
    // If the new student is the same as the current one, no further action is required.
}

 


    // Default Constructor
    public HCTProfile() {
        // You can leave the body of the constructor empty
        // or set the attributes to their initial values
    }

    // Parameterized Constructor
    public HCTProfile(int number, String type, String startDate) {
        this.number = number;
        this.type = type;
        this.startDate = startDate;
        this.student=new Student();
    }

    // Getters and Setters for custom attributes

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    // Update toString method to include HCTProfile details
    @Override
    public String toString() {
        return "\nHCTProfile Details\n=========\nNumber: " + this.getNumber() +
                "\nType: " + this.getType() + "\nStart Date: " + this.getStartDate();
    }

    public void display() {
        System.out.println(this.toString());
    }
}
