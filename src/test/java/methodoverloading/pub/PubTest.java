package methodoverloading.pub;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PubTest {

    @Test
    public void constructorTest() {
        //Given
        Pub pub = new Pub("Törpi kocsma", 9,30);
        //Then
        assertEquals("Törpi kocsma", pub.getName());
        assertEquals(9, pub.getOpenFrom().getHours());
        assertEquals(30, pub.getOpenFrom().getMinutes());
    }

    @Test
    public void toStringTest() {
        //Given
        Pub pub = new Pub("Törpi kocsma", 9,30);
        //Then
        assertEquals("Törpi kocsma; 9:30", pub.toString());

    }
}
