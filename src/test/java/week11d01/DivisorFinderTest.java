package week11d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    public void testFindDivisor(){

        DivisorFinder divisorFinder = new DivisorFinder();
        assertEquals(5, divisorFinder.findDivisors(425));
        assertEquals(0, divisorFinder.findDivisors(29));

    }

    @Test
    public void findDivisorShouldThrowException() {
        int n = 302;
        DivisorFinder divisorFinder = new DivisorFinder();
        assertThrows(ArithmeticException.class, ()-> new DivisorFinder());
    }

}