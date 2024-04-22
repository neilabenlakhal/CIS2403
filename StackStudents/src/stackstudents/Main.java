/*

 */
package stackstudents;

/**
 *
 * @author nlakhal
 */
import java.util.Stack;

class Student {

    private int id;
    private String name;
    private double gpa;

    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", GPA: " + gpa;
    }
}

public class Main {

    public static void main(String[] args) {
        // Create Stack of Students
        Stack<Student> students = new Stack<Student>();

        // Add 5 students  to the stack
        Student s =  new Student(1, "A", 3.5);
        students.push(s);
        students.push(new Student(3, "B", 3.2));
        students.push(new Student(2, "C", 3.8));
        students.push(new Student(5, "D", 3.9));
        students.push(new Student(4, "E", 3.4));

        
        // Display all the students in the stack
        System.out.println("All Students:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Calculate and display the average GPA of all students
        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.getGpa();
        }
        double averageGPA = totalGPA / students.size();
        System.out.println("\nAverage GPA of all students: " + averageGPA);

    }

}
