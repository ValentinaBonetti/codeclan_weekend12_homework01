package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private String location;
    private ArrayList<ISell> stock = new ArrayList<ISell>();

    public Shop(String name, String location) {
        this.name = name;
        this.location = location;
        this.stock = stock;
    }

    public void addItemToStock(ISell saleable) {
        this.stock.add(saleable);
    }

    public int countItemsInStock() {
        return this.stock.size();
    }

    public boolean removeItemFromStock(ISell saleable) {
        if(stock.contains(saleable)) {
            stock.remove(saleable);
            return true;
        } else {
            return false;
        }
    }

    public String name() {
        return this.name;
    }

    public String location() {
        return this.location;
    }

    public double calculatePotentialProfit() {
        double total = 0.0;
        for(ISell saleable : stock){
            total += saleable.calculateMarkup();
        }
        return total;
    }
}
