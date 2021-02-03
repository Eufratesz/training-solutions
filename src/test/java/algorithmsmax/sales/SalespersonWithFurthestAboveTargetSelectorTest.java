package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonWithFurthestAboveTargetSelectorTest {


    List<Salesperson> salespersonList = Arrays.asList(
            new Salesperson("John", 600_000, 500_000),
            new Salesperson("Joe", 900_000, 500_000),
            new Salesperson("Jim", 1_300_000, 500_000),
            new Salesperson("Jamew", 400_000, 500_000),
            new Salesperson("Johann", 1_100_000, 500_000)
    );
    @Test
    void TestFindSalespersonWithBestResults() {
        //Given
        SalespersonWithFurthestAboveTargetSelector sfats = new SalespersonWithFurthestAboveTargetSelector();
        //Then
        assertEquals("Jim", sfats.findSalespersonWithBestResults(salespersonList).getName());
        assertEquals(800_000, sfats.findSalespersonWithBestResults(salespersonList).getDifferenceAmontOverTarget());
        assertEquals(500_000, sfats.findSalespersonWithBestResults(salespersonList).getTarget());
        assertEquals(1_300_000, sfats.findSalespersonWithBestResults(salespersonList).getAmount());
    }
}