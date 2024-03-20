
/**
 *
 * @author mwannous
 */
import java.util.Scanner;
import java.util.Stack;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Get an exp from the user
        System.out.println("Type an expression");
        Scanner keyboard = new Scanner(System.in);
        String expText = keyboard.next();

        //Declare a Stack object to store parentheses.
        Stack<Character> parentheses = new Stack<>();

        //Scan the input
        //Push left parentheses into the stack
        boolean valid = true;
        for (int index = 0; index < expText.length(); index++) {
            char oneChar = expText.charAt(index);
            if (oneChar == '{' || oneChar == '[' || oneChar == '(') {
                parentheses.push(oneChar);
            } else {
                //Check if the char is a closing character
                switch (oneChar) {
                    case '}': {
                        if (parentheses.pop() != '{') {
                            valid = false;
                        }
                        break;
                    }
                    case ']': {
                        if (parentheses.pop() != '[') {
                            valid = false;
                        }
                        break;
                    }
                    case ')': {
                        if (parentheses.pop() != '(') {
                            valid = false;
                        }
                        break;
                    }
                }
            }
        }
        if (valid) {
            System.out.println("Valid expression!");
        } else {
            System.out.println("Invalid expression!");
        }
    }

}
