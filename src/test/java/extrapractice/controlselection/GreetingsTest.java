package extrapractice.controlselection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingsTest {

    @Test
    void testGreeter(){
        Greetings greetings = new Greetings();
        assertEquals("Jó reggelt!", greetings.greeter(5,5));
        assertEquals("Jó éjszakát!", greetings.greeter(4,55));
        assertEquals("Jó napot!", greetings.greeter(18,30));
        assertEquals("Jó napot!", greetings.greeter(17,30));
        assertEquals("Jó estét!", greetings.greeter(18,32));
        assertEquals("Jó éjszakát!", greetings.greeter(21,52));
        assertEquals("Jó éjszakát!", greetings.greeter(2,2));
    }

}