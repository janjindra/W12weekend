package shop.parts;

import shop.Item;

public class SheetMusic extends Item {

    //instance variables
    private String genre;

    //constructor
    public SheetMusic(String productName, double purchasePrice, double sellingPrice, String genre){
        super(productName, purchasePrice, sellingPrice);
        this.genre = genre;
    }

    //method



}
