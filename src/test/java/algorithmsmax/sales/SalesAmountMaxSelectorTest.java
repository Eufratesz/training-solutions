package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalesAmountMaxSelectorTest {

    List<Salesperson> salespersonList = Arrays.asList(
            new Salesperson("John", 100_000, 500_000),
            new Salesperson("Joe", 200_000, 500_000),
            new Salesperson("Jim", 300_000, 500_000),
            new Salesperson("Jamew", 400_000, 500_000),
            new Salesperson("Johann", 600_000, 500_000)
    );

    @Test
    void TestFindSalespersonWithMaxAmount() {
        SalesAmountMaxSelector smax = new SalesAmountMaxSelector();

        assertEquals(600_000, smax.findSalespersonWithMaxAmount(salespersonList).getAmount());
        assertEquals("Johann", smax.findSalespersonWithMaxAmount(salespersonList).getName());





    }
}