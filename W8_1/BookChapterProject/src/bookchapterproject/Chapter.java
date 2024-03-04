package bookchapterproject;

/**
 *
 */
public class Chapter {

    private int chapNo;
    private String chapTitle;

    public int getChapNo() {
        return chapNo;
    }

    public String getChapTitle() {
        return chapTitle;
    }

    public Chapter(int chapNo, String chapTitle) {
        this.chapNo = chapNo;
        this.chapTitle = chapTitle;
    }

    public Chapter() {
        this.chapNo = 0;
        this.chapTitle = "";
    }
}
