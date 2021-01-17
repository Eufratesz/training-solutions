package ioreadstring.transaction;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    @Test
    public void testCreateAccount() {
        BankAccount bankAccount = new BankAccount("John Doe", "1234-5678-9876", 1_000_000);
        assertEquals("John Doe", bankAccount.getName());
        assertEquals("1234-5678-9876", bankAccount.getAccountNumber());
        assertEquals(1_000_000, bankAccount.getBalance());

    }
    @Test
    public void testAddBalance() {
        BankAccount bankAccount = new BankAccount("John Doe", "1234-5678-9876", 1_000_000);
        assertEquals(1_000_000, bankAccount.getBalance(), 0.0000001);

        bankAccount.setBalance(10_000);
        assertEquals(1_010_000, bankAccount.getBalance(), 0.0000001);
    }

}