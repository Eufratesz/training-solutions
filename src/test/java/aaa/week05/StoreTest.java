package aaa.week05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    @Test
    void addProductTest(){
        Store store = new Store();
        assertFalse(store.addFreshProduct(new Product("milk", 2020, 11, 25)));
        assertTrue(store.addFreshProduct(new Product("apple", 2021, 7, 25)));
        assertFalse(store.addFreshProduct(new Product("milk", 2021, 7, 25)));
    }

}