package algorithmscount.bankaccounts;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionTest {

    @Test
    public void createTransaction(){
        Transaction transaction = new Transaction("123456789", TransactionType.CREDIT, 100_000);
        assertEquals("123456789", transaction.getAccountNumber());
        assertEquals(true, transaction.isCredit());
        assertEquals(false, transaction.isDebit());
        assertEquals(100_000, transaction.getAmount());
    }

}