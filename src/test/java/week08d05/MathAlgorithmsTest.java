package week08d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathAlgorithmsTest {
    @Test
    public void TestGreatestCommonDivisor() {
        MathAlgorithms ma= new MathAlgorithms();

        assertEquals(2,ma.greatestCommonDivisor(8,6));
        assertEquals(18, ma.greatestCommonDivisor(18,36));
        assertEquals(12,ma.greatestCommonDivisor(12,12));
        assertEquals("A szám pozitív legyen!", ma.greatestCommonDivisor(-12,16));

    }
}
