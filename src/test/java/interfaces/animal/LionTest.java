package interfaces.animal;

import interfaces.animal.Lion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LionTest {

    @Test
    public void testGetName() throws Exception {
        Lion lion = new Lion();
        assertEquals("Lion", lion.getName());
    }

    @Test
    public void testGetNumberOfLegs() throws Exception {
        Lion lion = new Lion();
        assertEquals(4, lion.getNumberOfLegs());
    }
}

