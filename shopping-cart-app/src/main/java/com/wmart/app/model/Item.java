package com.wmart.app.model;

import java.util.StringJoiner;

public abstract class Item {

   protected String name;
   protected double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public Item(){

    }

    public Item(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<=0){
            System.err.println("Price cannot be zero or negative");
            return;
        }
        this.price = price;
    }
    

    @Override
    public String toString() {
        return new StringJoiner(", ", Item.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("price=" + price)
                .toString();
    }

    public abstract void showItem();

}
