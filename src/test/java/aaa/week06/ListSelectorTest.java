package aaa.week06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListSelectorTest {

    ListSelector listSelector = new ListSelector();

    @Test
    void testSelectEverySecond() {

        List<String> words = Arrays.asList("doll", "ball", "plane", "train", "kite", "puzzle");
        String result = listSelector.selectEverySecond(words);
        assertEquals("[dollplanekite]", result);
    }

    @Test
    void testNull() {
        assertThrows(IllegalArgumentException.class, () -> listSelector.selectEverySecond(null));

        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> listSelector.selectEverySecond(null));
        assertEquals("list is null!", iae.getMessage());
    }

    @Test

    void testEmptyList(){
        assertEquals("", listSelector.selectEverySecond(new ArrayList<>()));
    }
}
