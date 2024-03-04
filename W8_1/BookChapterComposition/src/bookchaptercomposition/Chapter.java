package bookchaptercomposition;

/**
 *
 */
public class Chapter {
    private int chapNo;
    private String chapTitle;
    
    public int getChapNo(){
        return chapNo;
    }
    public String getChapTitle(){
        return chapTitle;
    }
    
    public Chapter(){
        
    }
    public Chapter(String chapTitle, int chapNo){
        this.chapTitle = chapTitle;
        this.chapNo = chapNo;
    }
}
