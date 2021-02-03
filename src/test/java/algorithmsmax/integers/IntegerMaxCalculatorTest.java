package algorithmsmax.integers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerMaxCalculatorTest {

    @Test
    void max() {
        //Given
        List<Integer> numbers = Arrays.asList(23, 67,947,928, 784);
        //When
        IntegerMaxCalculator imaxc = new IntegerMaxCalculator();
        //Then
        assertEquals(947, imaxc.max(numbers));
    }
}