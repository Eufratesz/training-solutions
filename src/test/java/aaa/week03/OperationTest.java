package aaa.week03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationTest {

    @Test
            void testGetResult() {
        Operation operation = new Operation();
        operation.getResult("100+15");
        assertEquals(115, operation.getResult("100+15"));
    }

    @Test
    void testGetResultWithSpace(){
        Operation operation1 = new Operation();
        int result = operation1.getResult(("     100   +   15   "));
        assertEquals(115, result);
    }



    }
