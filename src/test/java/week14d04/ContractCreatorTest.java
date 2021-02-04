package week14d04;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContractCreatorTest {



    @Test
    void createTemplate() {
        //Given
        ContractCreator cr = new ContractCreator("John Doe", new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12)));
        ContractCreator cr2 = new ContractCreator("Jane Doe", new ArrayList<>(List.of(11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)));
        //Then
        assertEquals("John Doe", cr.create("John Doe").getClient());
        assertEquals(11, cr.create("John Doe").getMonthlyPrices().get(10));
        assertEquals("Jane Doe", cr2.create("Jane Doe").getClient());
        assertEquals(22, cr2.create("John Doe").getMonthlyPrices().get(11));


    }


}