package contorliteration.dictionary;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTest {


    @Test
    void testAddItem() {
        Dictionary dictionary = new Dictionary();
        assertEquals(0, dictionary.getDictionaryItems().size());

        dictionary.addItem("vár", Arrays.asList("expect", "wait for"));

        List<String> translations = dictionary.findTranslations("vár");
        assertEquals(Arrays.asList("expect", "wait for"), translations);
    }
}

