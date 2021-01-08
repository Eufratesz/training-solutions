package week10d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void testCalculator() {

        assertEquals(16, new Calculator().findMinSum(new int[]{1,9,5,7,3}));
        assertEquals(11, new Calculator().findMinSum(new int[]{1,9,5,7,3, 2}));
    }

    @Test
    public void testCalculatorTooShortList() {
        Exception ex1 = assertThrows(IllegalArgumentException.class, () -> new Calculator().findMinSum(new int[] {}));
    }

}