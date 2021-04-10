package enumabstract.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionStateTest {

    @Test
    public void testIsCompleted(){
        HasTransactionState hasTransactionState = TransactionState.PENDING;

        assertEquals(false, hasTransactionState.isCompleted());
//        assertEquals(true, TransactionState.SUCCESS.isCompleted());
//        assertEquals(true, TransactionState.REJECTED.isCompleted());
    }

}