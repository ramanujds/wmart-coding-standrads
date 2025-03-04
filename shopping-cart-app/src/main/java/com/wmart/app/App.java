package com.wmart.app;

import com.wmart.app.model.Clothing;
import com.wmart.app.model.Electronics;
import com.wmart.app.model.Item;
import com.wmart.app.model.Size;
import com.wmart.app.service.CartOperation;
import com.wmart.app.service.CartOperationImpl;

public class App {

    public static void main(String[] args) {

        Electronics item1 = new Electronics("Laptop", 45000, 2);
        Electronics item2 = new Electronics("Mobile", 15000, 1);
        Clothing item3 = new Clothing("Shirt", 1500, Size.LARGE, "Blue");
        Clothing item4 = new Clothing("T-Shirt", 500, Size.MEDIUM, "Red");

        CartOperation cart = new CartOperationImpl();

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);

//        cart.showAllItems();

        Item item = cart.searchByName("watch");
        System.out.println(item);


    }

}
