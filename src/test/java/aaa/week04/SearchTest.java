package aaa.week04;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {

    @Test
    void testGetIndexesOfChar(){
        Search search = new Search();
        List<Integer> indexes = search.getIndexesOfChar("almafa", 'a');

        assertEquals(Arrays.asList(0, 3, 5), indexes);
    }

}