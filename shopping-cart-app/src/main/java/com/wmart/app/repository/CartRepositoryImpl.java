package com.wmart.app.repository;

import com.wmart.app.exception.ItemNotFoundException;
import com.wmart.app.model.Item;

import java.util.ArrayList;
import java.util.List;

public class CartRepositoryImpl implements CartRepository {

    List<Item> itemDb = new ArrayList<>();

    public Item addItem(Item item) {
        itemDb.add(item);
        return item;
    }

    public void removeItem(String name) throws ItemNotFoundException {
        Item item = findItemByName(name);
        itemDb.remove(item);
    }

    public void updateItemQuantity(Item item, int quantity) {

    }

    public void clearCart() {
        itemDb.clear();
    }

    public Item findItemByName(String name) throws ItemNotFoundException {
        for (var item:itemDb){
            if (item.getName().equalsIgnoreCase(name)){
                return item;
            }
        }
        throw new ItemNotFoundException("Item with name : "+name+ " not found");
    }


    public List<Item> getAllItems() {
        return itemDb;
    }
}
