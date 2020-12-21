package interfaces.animal;

import interfaces.animal.Worm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WormTest {

    @Test
    public void testGetName() throws Exception {
        Worm worm = new Worm();
        assertEquals("Worm", worm.getName());
    }

    @Test
    public void testGetNumberOfLegs() throws Exception {
        Worm worm = new Worm();
        assertEquals(0, worm.getNumberOfLegs());
    }
}