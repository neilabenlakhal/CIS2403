
package exception_student_cgpa;

/**
 
 
Create a student class with a private attribute CGPA,  a name and student ID
Check the student CGPA : 
if the CGPA is less than 0 or more than 4.0 throw ArithmeticException in the setter
if the CGPA is less than 0 or more than 4.0 throw InputMismatchException in the parameterized constructor

In the main class, create  2 students s1 and s2, 
use the parameterized constructor in s1
use  the  default constructor and the the setter in s2 


 * @author nlakhal
 */

import java.util.InputMismatchException; //step 1

public class Student {
    private double CGPA;
    private String name;
    private String studentID;

    // Default constructor
    public Student() {}

    // Parameterized constructor
    public Student(String name, String studentID, double CGPA) throws InputMismatchException {//step 2
        if (CGPA < 0.0 || CGPA > 4.0) {
            throw new InputMismatchException("CGPA must be between 0.0 and 4.0");
        }
        this.name = name;
        this.studentID = studentID;
        this.CGPA = CGPA;
    }

    // Getter and Setter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) throws ArithmeticException{ //step 2 
        if (CGPA < 0.0 || CGPA > 4.0) {
            throw new ArithmeticException("CGPA must be between 0.0 and 4.0");
        }
        this.CGPA = CGPA;
    }

    // Getter and Setter for Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for StudentID
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
}

