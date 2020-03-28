package shop;

import shop.behaviours.ISell;

public abstract class Item implements ISell {

    //instance variables
    private String productName;
    private double purchasePrice;
    private double sellingPrice;

    //constructor
    public Item(String productName, double purchasePrice, double sellingPrice){
        this.productName=productName;
        this.purchasePrice=purchasePrice;
        this.sellingPrice=sellingPrice;
    }


    //methods
    public double markUp(){
        return this.getSellingPrice() - this.getPurchasePrice();
    }


    //getters
    public String getProductName() {
        return productName;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }
}
