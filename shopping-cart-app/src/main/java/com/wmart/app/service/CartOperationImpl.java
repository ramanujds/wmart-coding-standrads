package com.wmart.app.service;


import com.wmart.app.exception.ItemNotFoundException;
import com.wmart.app.model.Item;

public class CartOperationImpl implements CartOperation{

 //   int []arr = new int[10];

    // arr[0], arr[1]

    Item []itemArr = new Item[5];
    int current = 0;

    public void addItem(Item item) {
        // Item name should not be null or blank
        // Price should not be less than or equal to zero
        // Throw InvalidItemException otherwise

        itemArr[current] = item;
        current++;
    }

    public void removeItem(String name) {

    }

    public void updateQuantity(int quantity) {

    }

    public void showAllItems(){
        for (int index = 0; index<current; index++){
            System.out.println(itemArr[index]);
        }
    }


    public Item searchByName(String name) throws ItemNotFoundException {
        for (int index = 0; index<current; index++){
            Item currentItem = itemArr[index];
            if(currentItem.getName().equalsIgnoreCase(name)){
                return currentItem;
            }
        }
        throw new ItemNotFoundException("Item with name '"+name+"' Not Found");
    }
}
