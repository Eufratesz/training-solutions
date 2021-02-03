package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonTest {

    @Test
    void salespersonShouldBeCreated(){
        Salesperson sp = new Salesperson("John", 100_000, 500_000);
        //Then
        assertEquals("John", sp.getName());
        assertEquals(100_000, sp.getAmount());
        assertEquals(500_000, sp.getTarget());

    }

}