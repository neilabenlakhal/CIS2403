package trianglesegment;

import java.util.ArrayList;

/**
 *
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Segment s1 = new Segment(12);
        Segment s2 = new Segment(13);
        Segment s3 = new Segment(10);
        
        ArrayList<Segment> segments = new ArrayList<>(3);
        segments.add(s1);
        segments.add(s2);
        segments.add(s3);
        
        Triangle t1 = new Triangle("Straight", segments);
        System.out.println("Type: " + t1.getType());
        for(Segment segment : t1.getSegments()){
            System.out.println("Segment: " + segment.getSide());
        }
    }
    
}
