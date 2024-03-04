package bicyclechaincomp;

/**
 *
 * @author mwannous
 */
public class Bicycle {
    private String color;
    private String type;
    
    //New attribute for the relation
    private Chain chain;
    
    public String getColor(){
        return color;
    }
    public String getType(){
        return type;
    }
    
    //Parametarised constructor
    public Bicycle(String type, String color, double chainLength){
        this.color = color;
        this.type = type;
        this.chain = new Chain(chainLength);
    }
    public double getChainLength(){
        return chain.getLength();
    }
}
