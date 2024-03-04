package bicyclechaincomp;

import java.io.Console;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author mwannous
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Bicycle> bicycles = new ArrayList<>();
        String line = "";
        Console keyboard = System.console();
        while (true) {
            try {
                clearScreen();
                printMenu();
                line = keyboard.readLine();
                line = line.trim();
                if (line.startsWith("add")) {
                    //Add a new Bicycle
                    String color = "", type = "";
                    double length;
                    System.out.println("Type the bicycle color: ");
                    color = keyboard.readLine();
                    System.out.println("Type the bicycle type: ");
                    type = keyboard.readLine();
                    System.out.println("Type the bicycle length: ");
                    length = Double.parseDouble(keyboard.readLine().trim());
                    bicycles.add(new Bicycle(type, color, length));
                } else if (line.startsWith("list")) {
                    System.out.print(""
                            + "+-----------+----------------------+------------+\n"
                            + "|Color      |Type                  |Chain Length|\n"
                            + "+-----------+----------------------+------------+\n");
                    for (Bicycle bicycle : bicycles) {
                        System.out.print("|" + String.format("%10.10s", bicycle.getColor()) + "|");
                        System.out.print(String.format("%23.23s", bicycle.getType()) + "|");
                        System.out.print(String.format("%12f", bicycle.getChainLength()) + "|\n");
                        System.out.print("+-----------+----------------------+------------+\n");
                    }
                } else if (line.startsWith("exit")) {
                    break;
                } else {
                    System.out.println("Unrecognized command!");
                }
                System.out.println("Press Enter to continue!");
                keyboard.readLine();
            } catch (IOException | InterruptedException ex) {
                System.out.println("A fatal exception has occured!\n"
                        + ex.getMessage()
                        + "\nGoing back to the main menu");
                keyboard.readLine("Press return to continue!");
            }
        }
    }

    private static void clearScreen() throws IOException, InterruptedException {
        String os = System.getProperty("os.name");
        if (os.toLowerCase().contains("windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }

    private static void printMenu() {
        System.out.println(""
                + "+-------------------------------------+\n"
                + "|Command menu                         |\n"
                + "+-------------------------------------+\n"
                + "|To add a new Bicycle ,type add       |\n"
                + "|To list all bicycles ,type list      |\n"
                + "+-------------------------------------+\n"
                + "|To exist the application, type: exit |\n"
                + "+-------------------------------------+\n");
    }
}
