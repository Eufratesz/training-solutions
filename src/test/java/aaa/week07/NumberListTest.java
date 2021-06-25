package aaa.week07;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NumberListTest {

    @Test
    void testIsIncreasing() {
       NumberList numberList = new NumberList();
       assertTrue(numberList.isIncreasing(Arrays.asList(-1, 1, 2, 3, 4, 5, 6)));
       assertTrue(numberList.isIncreasing(Arrays.asList(-100, 1, 2, 3, 4, 5, 6)));
       assertTrue(numberList.isIncreasing(Arrays.asList(1, 1, 2, 2, 4, 4, 6)));
       assertFalse(numberList.isIncreasing(Arrays.asList(-1, 1, 2, 3, 4, 5, 6, 2)));

    }
}