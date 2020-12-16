package week08d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringListsTest {

    @Test
    public void TestStringLists() {
        StringLists stringLists = new StringLists();
        List<String> first = Arrays.asList("alma", "körte","banán", "barack", "szilva");
        List<String> second = Arrays.asList("banán", "narancs", "körte", "dinnye");

        StringLists unio = new StringLists();

        assertEquals(Arrays.asList("alma", "körte","banán", "barack", "szilva", "narancs", "dinnye"), unio.stringListUnion(first, second));



    }
}
