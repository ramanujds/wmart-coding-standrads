package com.wmart.app.service;

import com.wmart.app.model.Item;

public interface CartOperation {

    void addItem(Item item);

    void removeItem(String name);

    void updateQuantity(int quantity);

    void showAllItems();

    Item searchByName(String name);

}
