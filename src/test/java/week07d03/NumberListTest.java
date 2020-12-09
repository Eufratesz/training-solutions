package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class NumberListTest {

    @Test
    public void isIncreasingTest() {
        NumberList numberList = new NumberList();

        assertTrue(numberList.isIncreasing(Arrays.asList(1,2,3,3,3,5)));
        assertFalse(numberList.isIncreasing(Arrays.asList(1,2,3,2,0,5)));
    }
}
