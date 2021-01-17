package ioreadstring.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransactionManagerTest {

    private TransactionManager trm = new TransactionManager();

    @Test
    void TEstUploadListFromFile() {
        assertEquals(0, trm.getAccountList().size());

        trm.uploadListFromFile("src/test/resources/accounts.txt" );
        assertEquals(5, trm.getAccountList().size());
        assertEquals("Jim Smith", trm.getAccountList().get(3).getName());
        assertEquals("3456-7899-1234", trm.getAccountList().get(3).getAccountNumber());
        assertEquals(250000, trm.getAccountList().get(3).getBalance());


    }

    @Test
    void TestMakeTransactions() {
        trm.uploadListFromFile("src/test/resources/accounts.txt");
        trm.makeTransactions("src/test/resources/transactions.txt");

        assertEquals(201000, trm.getAccountList().get(2).getBalance(), 000001);  //200_000 + 1_000
        assertEquals(500000, trm.getAccountList().get(4).getBalance(), 000001);   //500_000 + 0
        assertEquals( 200000, trm.getAccountList().get(0).getBalance(), 0.000001); //100_000 + 100_000


    }

    @Test
    void TestGetAccountList() {
    }
}