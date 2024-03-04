
package bookchapterproject;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "itsme", 100000);
        b1.addChapter(1, "Intro");
        b1.addChapter(2, "Variables");
        b1.addChapter(3, "Classes");
        
        System.out.println("Book Details:");
        System.out.println("Title: " + b1.getTitle());
        System.out.println("Author: " + b1.getAuthor());
        System.out.println("Price: " + b1.getPrice());
        System.out.println("Book Chapter:");
        for(Chapter chapter : b1.getChapters()){
            System.out.println("Chapter No: " + chapter.getChapNo());
            System.out.println("Chapter Title: " + chapter.getChapTitle());
        }
//        b1 = null;
    }
    
}
