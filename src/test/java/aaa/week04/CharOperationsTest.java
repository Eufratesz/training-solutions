package aaa.week04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharOperationsTest {

    @Test
    void testGetPositionOfChars(){
        CharOperations charOperations = new CharOperations();
        List<Integer> result = charOperations.getPositionOfChars("alma", "a");
        assertEquals(Arrays.asList(0, 3) , result);
    }

}