package week06d01;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class ListSelectorTest {

    ListSelector ls = new ListSelector();

    @Test
    public void getEvenIndexElementsTest() {
        assertEquals("[almabarack]", ls.selector(Arrays.asList("alma", "körte", "barack")));
    }

    @Test
    public void selectorWithNull() {
        assertThrows(IllegalArgumentException.class, ()->ls.selector(null));
    }



    @Test
    public void selectorWithEmptyList() {
        assertEquals("", ls.selector(new ArrayList<>()));
    }
}
