package shop;

import shop.behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    //instance variables
    private String name;
    private ArrayList<ISell> stock;

    //constructor
    public Shop(String name){
        this.name=name;
        this.stock= new ArrayList<ISell>();

    }

    //methods
    public void addToStock(ISell product){
        stock.add(product);
    }

    public void removeFromStock(ISell product){
        stock.remove(product);
    }

    public double shopsTotalProfit(){
        double profitTotal = 0;
        for (ISell item : this.stock){
            double profitPerItem = item.markUp();
            profitTotal +=profitPerItem;
        }
        return profitTotal;
    }


    //getters
    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }


}
