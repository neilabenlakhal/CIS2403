/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.Lab04_Ex01_unidirectional;

/**
 *
 * @author neila
 */


public class HCTProfile {

    // Custom attributes
    private int number;
    private String type;
    private String startDate;

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
