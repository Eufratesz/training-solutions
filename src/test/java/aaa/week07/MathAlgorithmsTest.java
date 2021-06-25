package aaa.week07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmsTest {

    @Test
    void testisPrime() {
        MathAlgorithms ma = new MathAlgorithms();
        assertTrue(ma.isPrime(2));
        assertTrue(ma.isPrime(3));
        assertTrue(ma.isPrime(7));
        assertTrue(ma.isPrime(17));
        assertFalse(ma.isPrime(20));
        assertFalse(ma.isPrime(4));
    }

    @Test
    void testException(){
        MathAlgorithms ma = new MathAlgorithms();
        assertThrows(IllegalArgumentException.class, ()->ma.isPrime(0));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, ()->ma.isPrime(0));

        assertEquals("Nem pozitív egész szám!", iae.getMessage());
    }
}