package com.wmart.app;

import com.wmart.app.exception.InvalidItemException;
import com.wmart.app.exception.ItemNotFoundException;
import com.wmart.app.model.Clothing;
import com.wmart.app.model.Electronics;
import com.wmart.app.model.Item;
import com.wmart.app.model.Size;
import com.wmart.app.service.CartOperation;
import com.wmart.app.service.CartOperationImpl;

import java.util.Scanner;
import java.util.SortedMap;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Electronics item1 = new Electronics(101,"Laptop", 45000, 2);
        Electronics item2 = new Electronics(201,"Mobile", 15000, 1);
        Clothing item3 = new Clothing(501,"Shirt", 1500, Size.LARGE, "Blue");
        Clothing item4 = new Clothing(502,"T-Shirt", 500, Size.MEDIUM, "Red");

        CartOperation cart = new CartOperationImpl();

        try {
            cart.addItem(item1);
            cart.addItem(item3);
            cart.addItem(item2);
            cart.addItem(item4);
        }
        catch (InvalidItemException ex){
            System.out.println(ex.getMessage());
        }

      cart.showAllItems();
        cart.applyDiscountsOnElectronics().forEach(System.out::println);


//        System.out.println("What are you looking for?");
//        String name = scan.next();
//        Item item;
//        try {
//            item = cart.searchByName(name);
//            System.out.println(item);
//        } catch (ItemNotFoundException e) {
//            System.out.println(e.getMessage());
//        }



    }

}
