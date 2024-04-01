package bookchaptercomposition;

import java.util.ArrayList;  //step 1

/**
 *
 */
public class Book {

    private String title; // java
    private String author; // Jane
    private double price; //500

    private ArrayList<Chapter> chapters; //step 2 add attribute

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

        chapters = new ArrayList<>(); //step 3 : update constructor (parameterized)
    }

    public Book() {
        chapters = new ArrayList<>(); // step 4 :  update constructor (default)
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Chapter> getChapters() { //step 5 : getter of attribute (composition)
        return chapters;
    }

    public void addChapter(String chapTitle, int chapNo, int pages) {
        Chapter chap = new Chapter(chapTitle, chapNo, pages);
        chapters.add(chap);

    }

    @Override

    public String toString() {

        String bookString = "";

        bookString += "Book Details --> title: " + title + ", author: " + author + ", price: " + price;

        for (Chapter c : chapters) {

            bookString += "\n" + c.toString();

        }

        return bookString;

    }

    public int calTotalPages() {
        int i;
        int total = 0;
        //loop type 1
        for (i = 0; i < chapters.size(); i++) {
            total += chapters.get(i).getPages();

        }
        return total;
        
        
        // loop type 2
       // for (Chapter c : chapters) {

         // total += c.getPages();

        }

       // return total;
         
    
    
    
}
