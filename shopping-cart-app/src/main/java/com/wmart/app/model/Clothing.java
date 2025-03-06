package com.wmart.app.model;

import java.util.SortedMap;
import java.util.StringJoiner;

public class Clothing extends Item{

    private Size size;

    private String color;

    public Clothing(int id, String name, double price, Size size, String color) {
        super(id, name, price);
        this.size = size;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Clothing.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("size=" + size)
                .add("color='" + color + "'")
                .add("name='" + name + "'")
                .add("price=" + price)
                .toString();
    }

    @Override
    public void showItem() {

        System.out.println("Name : "+name);
        System.out.println("Price : "+price);
        System.out.println("Size : "+size);
        System.out.println("Color : "+color);
    }

}
