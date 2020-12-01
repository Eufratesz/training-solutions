package week06d02;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class StoreTest {

    @Test
    public void getProductByCategoryNameTest() {
        Store store = new Store(Arrays.asList(
                new Product("kenyér", Category.BAKEDGOODS, 300),
                new Product("tej", Category.DAIRY, 200),
                new Product("csirkemell", Category.MEAT, 1200),
                new Product("répa", Category.OTHER, 200),
                new Product("kalács", Category.BAKEDGOODS, 400),
                new Product("karaj", Category.MEAT, 1100)
        ));


        assertEquals(2, store.getProductByCategoryName(Category.BAKEDGOODS));
        assertEquals(2,store.getProductByCategoryName(Category.MEAT));
        assertEquals(1, store.getProductByCategoryName(Category.DAIRY));
        assertEquals(1, store.getProductByCategoryName(Category.OTHER));


    }
}
