package shop.instruments;

import shop.behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    //instance variable


    //constructor
    public Piano(String productName, double purchasePrice, double sellingPrice, String material, String color, InstrumentType type){
        super(productName, purchasePrice, sellingPrice, material, color, type);
    }


    //methods
    public String play(){
        return "Ta-da-da Ta-da-da";
    }

    //getters



}
