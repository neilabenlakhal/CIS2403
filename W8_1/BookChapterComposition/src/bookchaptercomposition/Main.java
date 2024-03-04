package bookchaptercomposition;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book("Java Pro", "itsme", 100000);
        b1.addChapter("Intro", 1);
        b1.addChapter("Types", 2);
        
        System.out.println("Book Details");
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Price: " + b1.getPrice());
        
        System.out.println("Book Chapters");
        for(Chapter chap : b1.getChapters()){
            System.out.println("Chapter Number: " + chap.getChapNo());
            System.out.println("Chapter Title: " + chap.getChapTitle());
        }
    }
    
}
