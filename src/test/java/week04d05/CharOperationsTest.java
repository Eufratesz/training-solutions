package week04d05;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharOperationsTest {

    @Test
    void testGetPositionOfChar() {
        //Given
        CharOperations charOperations = new CharOperations();
        //When
        List<Integer> result = Arrays.asList(0,3);

        //Then
        assertEquals(result, charOperations.getPositionOfChar("alma", "a"));
    }
}