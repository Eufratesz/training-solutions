package aaa.week11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorFinderTest {

    @Test
    void testFindDivisors() {
        DivisorFinder divisorFinder = new DivisorFinder();
        int result = divisorFinder.findDivisors(425);       //5
        assertEquals(1, result);

        assertEquals(2, divisorFinder.findDivisors(342)); // 3, 2
    }
}