
/**
 * A stack is called an LIFO structure: last in/first out
 *
 */
import java.util.Stack; //step 1

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<String> names = new Stack<>(); //create stack of String : Programming languages names
        Stack<Double> cgpas = new Stack<>(); //create stack of CGPAS
        Stack<Integer> years = new Stack<>(); //create stack of years at HCT

        System.out.println("Test if the stack is empty ? " + names.isEmpty());

        names.push("Java"); // Push method to add elements to the stack
        names.push("python");
        names.push("HTML");
        System.out.println("Stack size: " + names.size());// method to get the size of the stack

        // Display all the elements in   the stack names
        System.out.println("All NAMES:");
        for (String s : names) {
            System.out.println(s);
        }

        Stack<Double> grades = new Stack<>(); //create the stack
        grades.push(90.5);
        grades.push(89.9);
        System.out.println("all your grades");
        double total_Grades = 0.0;
        for (Double d : grades) {
            System.out.println(d);
            total_Grades += d;
        }
        
        System.out.println("the total of the grades is : " + total_Grades);
        Double avg= total_Grades/grades.size();
        
    

    int place = names.search("Java"); //Method to search for an element and returns the index of the element in the Stack

    System.out.println ( "The index of the element JAVA is: " +place);
        
        
    System.out.println (
    "Testing peek() method ");//Peek method to return the top element from the stack without removing it
        String el = names.peek();

    System.out.println (el);

    System.out.println (
    "Testing pop() method ");//Pop method to remove and return the top element from the stack
         el  = names.pop();

    System.out.println (el);

    el  = names.get(1); //returns the element in the position 1

    System.out.println (el);

    names.pop ();

    names.pop ();

    System.out.println (

"Test if the stack is empty ? " + names.isEmpty());
    }
}
    


