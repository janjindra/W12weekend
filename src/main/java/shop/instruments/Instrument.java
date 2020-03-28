package shop.instruments;

import shop.Item;
import shop.behaviours.IPlay;


public abstract class Instrument extends Item {

    //instance vars
    private String material;
    private String color;
    private InstrumentType type;

    //constructor
    public Instrument(String productName, double purchasePrice, double sellingPrice, String material, String color, InstrumentType type){
        super(productName, purchasePrice, sellingPrice);
        this.material=material;
        this.color=color;
        this.type=type;
    }

    //methods

    //getters

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public InstrumentType getType() {
        return type;
    }
}
