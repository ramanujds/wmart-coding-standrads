package com.wmart.app.repository;


import com.wmart.app.exception.ItemNotFoundException;
import com.wmart.app.model.Electronics;
import com.wmart.app.model.Item;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CartRepositoryImplTest {

    CartRepositoryImpl cartRepo;
    @BeforeEach
    void setUp(){
        cartRepo = new CartRepositoryImpl();
    }


    @Test
    void addItem() {
        // Given
        Item item = new Electronics(1,"Phone",10000,1);
        Item item2 = new Electronics(2,"Watch",10000,1);
        // When
        cartRepo.addItem(item);
        cartRepo.addItem(item2);
        // Then
        Assertions.assertEquals(2,cartRepo.getAllItems().size());
    }


    @Test
    void removeItem() throws ItemNotFoundException {
        // Given
        Item item = new Electronics(1,"Phone",10000,1);
        Item item2 = new Electronics(2,"Watch",10000,1);
        // When
        cartRepo.addItem(item);
        cartRepo.addItem(item2);
        cartRepo.removeItem(1);
        // Then
        Assertions.assertThrows(ItemNotFoundException.class,()->cartRepo.findItem(1));
        Assertions.assertEquals(1,cartRepo.getAllItems().size());
    }






    @Test
    void clearCart() {
        // Given
        Item item = new Electronics(1,"Phone",10000,1);
        Item item2 = new Electronics(2,"Watch",10000,1);
        // When
        cartRepo.addItem(item);
        cartRepo.addItem(item2);
        cartRepo.clearCart();
        // Then
        Assertions.assertEquals(0,cartRepo.getAllItems().size());
    }


    @Test
    void findItemByName() {
        // Given
        Item item = new Electronics(1,"Phone",10000,1);
        Item item2 = new Electronics(2,"Watch",10000,1);
        // When
        cartRepo.addItem(item);
        cartRepo.addItem(item2);
        // Then
        Assertions.assertDoesNotThrow(()->cartRepo.findItemByName("Phone"));
    }


    @Test
    void findItem() {
        // Given
        Item item = new Electronics(1,"Phone",10000,1);
        Item item2 = new Electronics(2,"Watch",10000,1);
        // When
        cartRepo.addItem(item);
        cartRepo.addItem(item2);
        // Then
        Assertions.assertDoesNotThrow(()->cartRepo.findItem(1));
    }


    @Test
    void getAllItems() {
        // Given
        Item item = new Electronics(1,"Phone",10000,1);
        Item item2 = new Electronics(2,"Watch",10000,1);
        // When
        cartRepo.addItem(item);
        cartRepo.addItem(item2);
        // Then
        Assertions.assertEquals(2,cartRepo.getAllItems().size());
    }
}