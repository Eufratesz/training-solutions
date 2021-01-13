package week11d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    @Test
    public void testWordFilter() {
        WordFilter wordFilter = new WordFilter();
        List<String> newList = wordFilter.wordsWithChar(List.of("beans", "cat", "bananas", "coconut", "peach", "dog"), 'a');

        assertEquals(List.of("beans", "cat", "bananas", "peach"), newList);
    }

}