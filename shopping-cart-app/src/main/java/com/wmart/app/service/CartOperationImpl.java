package com.wmart.app.service;


import com.wmart.app.exception.InvalidItemException;
import com.wmart.app.exception.ItemNotFoundException;
import com.wmart.app.model.Electronics;
import com.wmart.app.model.Item;
import com.wmart.app.repository.CartRepository;
import com.wmart.app.repository.CartRepositoryImpl;

import java.util.ArrayList;
import java.util.List;

public class CartOperationImpl implements CartOperation {


    private CartRepository cartRepo = new CartRepositoryImpl();

    public void addItem(Item item) throws InvalidItemException {
        // Item name should not be null or blank
        if (item.getName() == null || item.getName().isBlank()) {
            throw new InvalidItemException("Invalid Name");
        }
        // Price should not be less than or equal to zero

        // Throw InvalidItemException otherwise

        cartRepo.addItem(item);
    }

    public void removeItem(int id) throws ItemNotFoundException {
        cartRepo.removeItem(id);
    }

    public void updateQuantity(int quantity) {

    }

    public void showAllItems() {
        var itemList = cartRepo.getAllItems();
        for (Item item : itemList) {
            System.out.println(item);
        }
    }


    public List<Item> applyDiscountsOnElectronics(){
        List<Item> allItems = cartRepo.getAllItems();
        allItems.forEach(
                item -> {
                    if (item instanceof Electronics){
                        item.setPrice(item.getPrice() * .9);
                    }
                }

        );
        return allItems;
    }

    public Item searchByName(String name) throws ItemNotFoundException {
        return cartRepo.findItemByName(name);
    }

    @Override
    public Item getItem(int id) throws ItemNotFoundException {
        return cartRepo.findItem(id);
    }
}
