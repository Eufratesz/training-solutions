package controladvanced;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesTest {

    @Test
    void testFindDuplicates() {

        Duplicates duplicates = new Duplicates();
        List<Integer> numbers = Arrays.asList(2, 8, 4, 7, 5, 9, 5);

        assertEquals(Arrays.asList(), duplicates.findDuplicates(Arrays.asList(1, 2, 3, 4)));
        assertEquals(Arrays.asList(1), duplicates.findDuplicates(Arrays.asList(1, 2, 3, 4, 1)));
        assertEquals(Arrays.asList(1, 3), duplicates.findDuplicates(Arrays.asList(1, 2, 3, 4, 1, 3)));

    }
}