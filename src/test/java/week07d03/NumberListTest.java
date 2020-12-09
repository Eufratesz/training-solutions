package week07d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class NumberListTest {

    @Test
    public void isIncreasingTest() {
        NumberList numberlist = new NumberList();
        List<Integer> numberList = Arrays.asList(1,2,3,3,3,5);
//Ez nem  megy:(
        assertTrue(numberList.isIncreasing());
        assertFalse(
    }
}
