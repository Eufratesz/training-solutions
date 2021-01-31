package collectionsset.collecionstreeset;

import org.junit.jupiter.api.Test;

import java.util.Set;
import java.util.SortedSet;

import static org.junit.jupiter.api.Assertions.*;

class WordFilterTest {

    public final static String[] randomString = new String[] {"xyz", "abc", "def", "ghi", "jkl"};

    @Test
    void checkSetSizeAndOrder(){
        //When
        Set<String> testSet = new WordFilter().filterWords(randomString);
        //Then
        assertEquals(5, testSet.size());
        assertEquals("abc", ((SortedSet<String>)testSet).first());
        assertEquals("xyz", ((SortedSet<String>)testSet).last());
    }

}