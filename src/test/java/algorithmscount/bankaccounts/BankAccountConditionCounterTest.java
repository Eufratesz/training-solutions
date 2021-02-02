package algorithmscount.bankaccounts;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountConditionCounterTest {

    @Test
    void countNumberOfAccounts() {
        //Given
        BankAccountConditionCounter bcc = new BankAccountConditionCounter();

        List<BankAccount>bankAccounts=  new ArrayList(Arrays.asList(
                new BankAccount("John Smith", 12234444, 300_000),
                new BankAccount("John Thomas", 12234445, 400_000),
                new BankAccount("John Doe", 12234446, 200_000),
                new BankAccount("John James", 12234447, 100_000),
                new BankAccount("John Smith", 12234448, 350_000)
                ));
        //Then
        assertEquals(3, bcc.countNumberOfAccounts(bankAccounts, 200_000));
    }
}