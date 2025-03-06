package com.wmart.app.model;

import java.util.StringJoiner;

public class Electronics extends Item{

    private int warranty;

    public Electronics(int id, String name, double price, int warranty) {
        super(id, name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Electronics.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("warranty=" + warranty)
                .add("name='" + name + "'")
                .add("price=" + price)
                .toString();
    }

    @Override
    public void showItem() {
        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
        System.out.println("Warranty : "+warranty);
    }
}
