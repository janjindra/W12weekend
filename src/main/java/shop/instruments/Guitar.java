package shop.instruments;

import shop.behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    //instance variable
    public int numberOfStrings;

    //constructor
    public Guitar(String productName, double purchasePrice, double sellingPrice, String material, String color, InstrumentType type, int numberOfStrings){
        super(productName, purchasePrice, sellingPrice, material, color, type);
        this.numberOfStrings=numberOfStrings;
    }



    //methods
    public String play(){
        return "zzzZZZzzz";
    }

    //getters
    public int getNumberOfStrings() {
        return numberOfStrings;
    }
}
