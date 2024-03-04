package lab05_Ex02;

/**
 *
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

    public Chain getBicChain() {
        return bicChain;
    }

    public void setBicChain(Chain bicChain) {
        this.bicChain = bicChain;
    }
    
    
    public Bicycle(String color, String type, Chain bicChain){
        this.type = type;
        this.color = color; 
        this.bicChain = bicChain;// aggregation
    }
    
    public double getChainLength(){
        return bicChain.getLength();
    }
}
