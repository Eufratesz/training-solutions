package week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationTest {
    @Test
    void testGetResult() {
        //Given
        Operation operation = new Operation("16+32");
        //When
        int result = operation.getResult();
        //Then
        assertEquals(48, result);
    }

        @Test
        void testResultWithSpaces() {
           Operation op = new Operation(" 16 + 32 ");
           int resultWithSpace = op.getResult();
           assertEquals(48, resultWithSpace);

        }
    }



