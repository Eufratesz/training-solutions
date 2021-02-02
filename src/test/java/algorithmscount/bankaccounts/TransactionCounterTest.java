package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransactionCounterTest {

    @Test
    void TestcountSmallerTransactionThan() {
        //Given
        List<Transaction>transactions= Arrays.asList(
                new Transaction("123456789", TransactionType.CREDIT, 100_000),
                new Transaction("123456799", TransactionType.CREDIT, 200_000),
                new Transaction("223456789", TransactionType.CREDIT, 400_000)
                );

        //Then
        assertEquals(2, new TransactionCounter().countSmallerTransactionThan(transactions, 300_000));
        assertEquals(0, new TransactionCounter().countSmallerTransactionThan(transactions, 100_000));
        assertEquals(3, new TransactionCounter().countSmallerTransactionThan(transactions, 500_000));

    }
}