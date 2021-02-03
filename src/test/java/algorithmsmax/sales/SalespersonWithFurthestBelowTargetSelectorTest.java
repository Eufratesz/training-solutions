package algorithmsmax.sales;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SalespersonWithFurthestBelowTargetSelectorTest {



        List<Salesperson> salespersonList = Arrays.asList(
                new Salesperson("John", 600_000, 1_000_000),
                new Salesperson("Joe", 900_000, 1_000_000),
                new Salesperson("Jim", 1_300_000, 1_000_000),
                new Salesperson("James", 400_000, 1_000_000),
                new Salesperson("Johann", 1_100_000, 1_000_000)
        );
    @Test
    void testFindWorstSalesperson() {


        //Given
        SalespersonWithFurthestBelowTargetSelector salespersonWithWorstResult = new SalespersonWithFurthestBelowTargetSelector();

        //Then
        assertEquals("James", salespersonWithWorstResult.findWorstSalesperson(salespersonList).getName());
        assertEquals(1_000_000, salespersonWithWorstResult.findWorstSalesperson(salespersonList).getTarget());
        assertEquals(400_000, salespersonWithWorstResult.findWorstSalesperson(salespersonList).getAmount());
        assertEquals(600_000, salespersonWithWorstResult.findWorstSalesperson(salespersonList).getDifferenceBelowTarget());
        assertEquals(-600_000, salespersonWithWorstResult.findWorstSalesperson(salespersonList).getDifferenceAmontOverTarget());
    }

}