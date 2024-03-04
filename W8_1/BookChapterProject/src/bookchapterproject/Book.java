package bookchapterproject;
import java.util.ArrayList;
/**
 *
 */
public class Book {
    private String title;
    private String author;
    private double price;
    
    private final ArrayList<Chapter> myBookChapters;
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }
    
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        this.myBookChapters = new ArrayList<>();
    }
    
    public void addChapter(int chapNo, String chapTitle){
        Chapter chapter = new Chapter(chapNo, chapTitle);
        myBookChapters.add(chapter);
//        myBookChapters.add(new Chapter(chapNo, chapTitle));
    }
    public ArrayList<Chapter> getChapters(){
        return myBookChapters;
    }
}
