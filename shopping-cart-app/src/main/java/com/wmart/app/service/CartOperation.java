package com.wmart.app.service;

import com.wmart.app.exception.InvalidItemException;
import com.wmart.app.exception.ItemNotFoundException;
import com.wmart.app.model.Item;

import java.util.List;

public interface CartOperation {

    void addItem(Item item) throws InvalidItemException;

    void removeItem(int id) throws ItemNotFoundException;

    void updateQuantity(int quantity);

    void showAllItems();

    Item searchByName(String name) throws ItemNotFoundException;

    Item getItem(int id) throws ItemNotFoundException;

    List<Item> applyDiscountsOnElectronics();

}
