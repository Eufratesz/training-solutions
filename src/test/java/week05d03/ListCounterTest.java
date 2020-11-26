package week05d03;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListCounterTest {

    @Test
    public void counterTest(){
        ListCounter listCounter = new ListCounter();
        List<String> testList = Arrays.asList("Anna", "Balázs", "asztal", "szék");

        assertEquals(2, listCounter.counter(testList));
    }

    @Test
    public void emptyListTest() {
        ListCounter listCounter = new ListCounter();
        List<String> testList = new ArrayList<>();
        assertEquals(0, listCounter.counter(testList));
    }

    @Test
    public void nonAWordsTest() {
        ListCounter listcounter = new ListCounter();
        List<String> testList = Arrays.asList("Csaba", "Marci", "tél", "barack");
        assertEquals(0, listcounter.counter(testList));
    }
}
