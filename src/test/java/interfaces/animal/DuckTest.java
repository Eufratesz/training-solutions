package interfaces.animal;

import interfaces.animal.Duck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuckTest {

    @Test
    public void testGetName() throws Exception {  //A kivételt kifelejtettem.
        Duck duck = new Duck();

        assertEquals("Duck", duck.getName());
    }

    @Test
    public void testGetNumberOfLegs() throws Exception {
        Duck duck = new Duck();
        assertEquals(2, duck.getNumberOfLegs());
    }
}

