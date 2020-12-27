package statemachine.seatheater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeatHeaterTest {

    @Test
    public void testSeatHeaterNext() {
        assertEquals(SeatHeaterState.THREE, SeatHeaterState.OFF.next());
        assertEquals(SeatHeaterState.TWO, SeatHeaterState.THREE.next());
        assertEquals(SeatHeaterState.OFF, SeatHeaterState.ONE.next());
        assertEquals(SeatHeaterState.ONE, SeatHeaterState.TWO.next());

    }
}
