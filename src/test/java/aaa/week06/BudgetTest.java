package aaa.week06;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {

    private Budget budget = new Budget(Arrays.asList(
            new Item(1220, 11,"pear"),
            new Item(1111, 12,"apple"),
            new Item(1111, 10,"peach"),
            new Item(1111, 10,"melon")
    ));

    @Test
    void testGetItemsByMonth(){
        List<Item> result = budget.getItemsByMonth(10);
        assertEquals(2, result.size());
        assertEquals("peach", result.get(0).getName());
        assertEquals("melon", result.get(1).getName());
    }
}