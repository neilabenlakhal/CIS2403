/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hct.ae.gpaappoop;

/**
 * Why should we make attributes private?
 *
 *
 * Encapsulation: Think of a class like a treasure chest, and its attributes are
 * the treasures inside. Making attributes private is like putting a lock on the
 * chest. It keeps the treasures safe and secure. This is called encapsulation –
 * bundling the data (attributes) and the methods (functions) that operate on
 * the data together.
 *
 * Controlled Access: If everyone can directly access and modify the treasures
 * in the chest, chaos might ensue. Making attributes private allows us to
 * control how and when the data inside the class can be accessed or changed. We
 * create specific doors (methods) to interact with the treasures. These doors
 * can check who's knocking and decide whether to allow or deny access.
 *
 * Preventing Accidents: Imagine if anyone could freely change the color of a
 * car's paint without any rules. By making attributes private, we set rules
 * (methods) for modifying or retrieving the data. This helps prevent accidental
 * changes and ensures that modifications follow certain conditions or checks.
 *
 * Adaptability: If we decide to change how something works inside the chest,
 * like the way we calculate the value of a treasure, we can do that without
 * affecting the outside world. Private attributes allow us to make changes
 * internally without breaking the code that relies on the class.
 *
 *
 *
 * @author nlakhal
 */
public class Student {

    // Attributes
    private String id;
    private String name;
    private String major;
    private double gpa;

    //Default Constructor
    public Student() {
        /* you can leave the body of the constructor empty
or you can set the attributes to their initial value */
    }

    public Student(String id, String name, String major, double gpa) {
        /*The arguments pass when invoking the parametrized constructor
will be assigned to the data members */
        this.id = id;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    /**
     * Getters and Setters
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Method to convert GPA to Grade
    public String gpaToGrade() {
        if (getGpa() >= 3.75) {
            return "A";
        } else if (getGpa() >= 3.5) {
            return "A-";
        } else if (getGpa() >= 3.25) {
            return "B+";
        } else if (getGpa() >= 3.0) {
            return "B";
        } else if (getGpa() >= 2.75) {
            return "B-";
        } else if (getGpa() >= 2.0) {
            return "C";
        } else if (getGpa() >= 0.0) {
            return "F";
        } else {
            return "Invalid GPA";
        }
    }

   // Define a toString method to return all the student info in a single string
    
    public String toString() {
    return "\nStudent Details\n=========\nID: " 
                 + this.getId() + "\nName: " + this.getName() 
                 + "\nMajor: " + this.getMajor() + "\nGPA: " + this.getGpa() + "\nGrade: " + this.gpaToGrade();
}
    
    public void display(){
System.out.println(this.toString());
}
    
    
}

