package trianglesegment;

import java.util.ArrayList;

/**
 *
 */
public class Triangle {
    private String type;
    //For the aggregation
    private ArrayList<Segment> segments;
    
    public String getType(){
        return type;
    }
    
    public ArrayList<Segment> getSegments(){  
        return segments;
    }
    
    public Triangle(String type, ArrayList<Segment> segments){
        this . type = type;
        this.segments = segments;
    }
    
     public Triangle(String type){
        this . type = type;
        this.segments = new ArrayList<Segment>(3);
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSegments(ArrayList<Segment> segments) {
        this.segments = segments;
    }
    
    
    
}
