package bicyclechaincom;

/**
 *
 * @author mwannous
 */
public class Bicycle {
    private String color;
    private String type;
    
    //For the relationship
    private Chain bicChain;
    
    public String getColor(){
        return color;
    }
    
    public String getType(){
        return type;
    }
    
    public Bicycle(String color, String type, double chainLength){
        this.type = type;
        this.color = color;
        
        bicChain = new Chain(chainLength);
    }
    
    public double getChainLength(){
        return bicChain.getLength();
    }
}
