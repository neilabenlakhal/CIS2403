package bookchaptercomposition;
import java.util.ArrayList;
/**
 *
 */
public class Book {
    private String title;
    private String author;
    private double price;
    
    private ArrayList<Chapter> chapters;
    
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    
    public double getPrice(){
        return price;
    }
    
    public void addChapter(String chapTitle, int chapNo){
    Chapter chap = new Chapter(chapTitle, chapNo);
   chapters.add(chap);
        //chapters.add(new Chapter(chapTitle, chapNo));
    }
    
    public ArrayList<Chapter> getChapters(){
        return chapters;
    }
    
    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this.price = price;
        
        chapters = new ArrayList<>();
    }
}
