package training.enumabstract;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TransactionStateTest {

    /*
    interface létrehozása előtti teszt
    @Test
    public void testIsCompleted() {
        assertFalse(TransactionState.PENDING.isCompleted());
        assertTrue(TransactionState.REJECTED.isCompleted());
        assertTrue(TransactionState.SUCCESS.isCompleted());
    }
     */

    @Test
    public void testIsCompleted() {
        HasTransactionState hasTransactionState = TransactionState.PENDING;
        assertFalse(hasTransactionState.isCompleted());

        HasTransactionState hasTransactionState1 = TransactionState.REJECTED;
        assertTrue(hasTransactionState1.isCompleted());

        HasTransactionState hasTransactionState2 = TransactionState.SUCCESS;
        assertTrue(hasTransactionState2.isCompleted());
    }
}
