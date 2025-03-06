package com.wmart.app.repository;

import com.wmart.app.exception.ItemNotFoundException;
import com.wmart.app.model.Item;

import java.util.List;

public interface CartRepository {

    Item addItem(Item item);
    void removeItem(int name) throws ItemNotFoundException;
    void updateItemQuantity(int id, int quantity);
    void clearCart();
    Item findItemByName(String name) throws ItemNotFoundException;
    Item findItem(int id) throws ItemNotFoundException;
    List<Item> getAllItems();
}
