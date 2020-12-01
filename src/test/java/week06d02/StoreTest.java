package week06d02;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class StoreTest {

    @Test
    public void getProductByCategoryNameTest() {
        Store store = new Store(Arrays.asList(
                new Product("kenyér", "pékáru", 300),
                new Product("tej", "tejtermék", 200),
                new Product("csirkemell", "húsféle", 1200),
                new Product("répa", "zöldség", 200),
                new Product("kalács", "pékáru", 400),
                new Product("karaj", "húsféle", 1100)
        ));


        assertEquals(2, store.getProductByCategoryName("húsféle"));
        assertEquals(2,store.getProductByCategoryName("pékáru"));
        assertEquals(1, store.getProductByCategoryName("tejtermék"));
        assertEquals(1, store.getProductByCategoryName("zöldség"));


    }
}
