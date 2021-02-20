package week03d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
    void testGetResult() {
        //Given
        Operation operation = new Operation("68+12");
        //When
        int result = operation.getResult();
        //Then
        assertEquals(80, result);

    }

    @Test
    void testGetResultWihtSpace() {
        //Given
        Operation operation = new Operation("  68   +  12  ");
        //When
        int result = operation.getResult();
        //Then
        assertEquals(80, result);

    }
}