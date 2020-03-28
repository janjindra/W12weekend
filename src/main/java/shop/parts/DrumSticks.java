package shop.parts;

import shop.Item;

public class DrumSticks extends Item {

    //instance variables
    public int length;

    //constructor
    public DrumSticks(String productName, double purchasePrice, double sellingPrice, int length){
        super(productName, purchasePrice, sellingPrice);
        this.length=length;
    }

    //method


    //getters
    public int getLength() {
        return length;
    }
}
