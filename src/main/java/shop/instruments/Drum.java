package shop.instruments;

import shop.behaviours.IPlay;

public class Drum extends Instrument implements IPlay {

    //instance variable
    private int numberOfSticks;

    //constructor
    public Drum(String productName, double purchasePrice, double sellingPrice, String material, String color, InstrumentType type, int numberOfStrings){
        super(productName, purchasePrice, sellingPrice, material, color, type);
        this.numberOfSticks=numberOfStrings;
    }



    //methods
    public String play(){
        return "Boom Booom Boom";
    }


    //getters
    public int getNumberOfSticks() {
        return numberOfSticks;
    }
}
