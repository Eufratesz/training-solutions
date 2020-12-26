package training.iterfacemethods;

import org.junit.jupiter.api.Test;
import training.interfacemethods.Account;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void testCreatedAfter(){
        Account account = new Account(LocalDateTime.of(2020,11,21,10,00));

        boolean result = account.createdAfter(LocalDateTime.of(2020,11,22,10,00));
        assertEquals(false, result);
    }
}
