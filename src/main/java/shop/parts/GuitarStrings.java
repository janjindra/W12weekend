package shop.parts;

import shop.Item;

public class GuitarStrings extends Item {

    //instance variables
    private String material;

    //constructor
    public GuitarStrings(String productName, double purchasePrice, double sellingPrice, String material){
        super(productName, purchasePrice, sellingPrice);
        this.material=material;
    }

    //method

    //getters
    public String getMaterial() {
        return material;
    }
}
