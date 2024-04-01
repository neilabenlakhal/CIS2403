package bookchaptercomposition;

/**
 *  Q1 : add an attribute pages : number of a pages in a chapter
 * Q2 : update constructor and add getter
 * Q3: override toString method to display also the chapters information
 * Q4 : implement a method to calculate the total number of pages in the book
 * 
 */
public class Chapter {
    private int chapNo;
    private String chapTitle;
   
    // 1- add attribute number of pages 
    private int pages;
    
    public int getChapNo(){
        return chapNo;
    }
    public String getChapTitle(){
        return chapTitle;
    }

    // 2- add getter 
    public int getPages() {
        return pages;
    }
    
    
    public Chapter(){
        
    }
    public Chapter(String chapTitle, int chapNo, int pages){ // 3 modify constructor 
        this.chapTitle = chapTitle;
        this.chapNo = chapNo;
        this.pages = pages;
    }

    @Override // annotation 
    public String toString() {
        return "Chapter details: " + "chapNo=" + chapNo + ", chapTitle=" + chapTitle + ", pages=" + pages;
    }
}
