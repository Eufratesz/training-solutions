package aaa.week10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testFindMinSum() {
        Calculator calculator = new Calculator();
        int result = calculator.findMinSum(new int[]{1, 3, 5, 7, 9});
        assertEquals(16, result);

        assertEquals(7, calculator.findMinSum(new int[]{1, 7, 1, 2, 3, 5}));
    }

    @Test
    void testTooShortArray() {
        Calculator calculator = new Calculator();
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> calculator.findMinSum(new int[]{1, 3, 5}));
        assertEquals("Not enough numbers!", iae.getMessage());
    }

}