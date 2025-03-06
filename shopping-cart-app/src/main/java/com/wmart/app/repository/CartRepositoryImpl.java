package com.wmart.app.repository;

import com.wmart.app.exception.ItemNotFoundException;
import com.wmart.app.model.Item;

import java.util.*;

public class CartRepositoryImpl implements CartRepository {

    Map<Integer, Item> itemDb = new HashMap<>();

    public Item addItem(Item item) {
        itemDb.put(item.getId(), item);
        return item;
    }

    public void removeItem(int id) throws ItemNotFoundException {
       itemDb.remove(id);
    }

    public void updateItemQuantity(int id, int quantity) {

    }


    public void clearCart() {
        itemDb.clear();
    }

    public Item findItemByName(String name) throws ItemNotFoundException {
//        for (var item:itemDb.values()){
//            if (item.getName().equalsIgnoreCase(name)){
//                return item;
//            }
//        }
//        throw new ItemNotFoundException("Item with name : "+name+ " not found");

       return itemDb.values().stream().filter(item->item.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow(()->new ItemNotFoundException("Item with name : "+name+ " not found"));

    }

    public Item findItem(int id) throws ItemNotFoundException {
        if (itemDb.containsKey(id))
            return itemDb.get(id);
        throw new ItemNotFoundException("Item with ID "+id+ " Not Found");
    }


    public List<Item> getAllItems() {
        return new ArrayList<>(itemDb.values());
    }
}
