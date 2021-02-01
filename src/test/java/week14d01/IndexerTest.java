package week14d01;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IndexerTest {


    /*
    new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}
     */
    @Test
    void index() {
        //Given
        List<String> testNames = Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna");

        //When
        Map<Character, List<String>> testMap = new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna"));

        //Then
        Indexer indexer = new Indexer();
        assertEquals(4, testMap.size());


        System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna", "Lajos")));
        Map<Character, List<String>>expected = Map.of('A', Arrays.asList("Abraham", "Adam"),('L'), Arrays.asList("Lujza"));
        System.out.println(expected);
    }
}