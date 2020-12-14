
package week07d02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DigitSumTest {


    @Test


    public void sumOfDigitsTest(){
        DigitSum digitSum = new DigitSum();

    Exception ex = assertThrows(IllegalArgumentException.class, () -> DigitSum.sumOfDigits(0));
        assertEquals("A szám legyen porzitív.", ex.getMessage());

        assertEquals( 6, 123);
        assertEquals( 8, 71);

    }
}


