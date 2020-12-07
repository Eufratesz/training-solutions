package week07d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathAlgorithmsTest {


    @Test
    public void isPrimeTest() {
        assertFalse(MathAlgorithms.isPrime(8));
        assertFalse(MathAlgorithms.isPrime(12));
        assertTrue(MathAlgorithms.isPrime(2));
        assertTrue(MathAlgorithms.isPrime(17));
        Exception ex = assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(0));
        assertEquals("Wrong parameter!", ex.getMessage());
        Exception ex2 =assertThrows(IllegalArgumentException.class, () -> MathAlgorithms.isPrime(-1));
        assertEquals("Wrong parameter!", ex.getMessage());


    }

}
