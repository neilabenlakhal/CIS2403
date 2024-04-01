package bookchaptercomposition;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book("Java", "Jane", 500);

        b1.addChapter("Intro", 1, 30);
        b1.addChapter("Types", 2, 15);

        System.out.println(b1.toString()); //display the book information
        System.out.println("total number of pages:  " + b1.calTotalPages()); // display tho total number of pages in the book

    }

}
