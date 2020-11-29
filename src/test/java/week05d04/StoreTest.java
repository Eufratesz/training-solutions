package week05d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class StoreTest {

    @Test
    public void addProductTest(){
        List<Product> testList = new ArrayList<>();
        Store store = new Store(testList);          //hozzáadunk egy kész listát

        assertFalse(store.addProduct(new Product("milk", 2020,11,25))); //lejárt, ezért false

        assertTrue(store.addProduct(new Product("milk", 2020,11,30))); //nem járt le
        assertFalse(store.addProduct(new Product("milk",2020,12,24))); //van már tej -- false.
    }

    @Test
    public void getNumberOfExpired(){
        List<Product> testList = new ArrayList<>();

        testList.add((new Product("milk", 2020,1,3)));  //lejárt
        Store store = new Store(testList);

        assertEquals(1, store.getNumberOfExpired());
    }
}
