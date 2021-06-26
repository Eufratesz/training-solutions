package aaa.week08;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void stringListsUnion() {
        StringLists stringLists = new StringLists();
        List<String> result = stringLists.stringListsUnion(Arrays.asList("a", "b", "c"), Arrays.asList("a", "d"));
        assertEquals(Arrays.asList("a", "b", "c", "d"), result);
    }
}