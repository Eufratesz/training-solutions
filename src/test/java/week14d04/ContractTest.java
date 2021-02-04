package week14d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContractTest {


    @Test
    void createContract(){
        Contract contract = new Contract("Jack Smith", new ArrayList<>(List.of(1,2,3,4)));
        assertEquals("Jack Smith", contract.getClient());
        assertEquals(1, contract.getMonthlyPrices().get(0));
        assertEquals(4, contract.getMonthlyPrices().get(3));
    }


}