package aaa.week05;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ListCounterTest {

    @Test
    void testCountWordsStartsWithA() {
        ListCounter listCounter = new ListCounter();
        int count = listCounter.countWordsStartsWithA(Arrays.asList("alma", "barack", "szilva", "Asztal", "Anna"));
        assertEquals(3, count);
    }

    @Test
    void testCountNoSuchWord(){
        ListCounter listCounter = new ListCounter();
        int count = listCounter.countWordsStartsWithA(Arrays.asList("körte", "barack", "szilva", "Ábel", "Hanna"));
        assertEquals(0, count);
    }

    @Test
    void testCountEmptyList(){
        ListCounter listCounter = new ListCounter();
        int count = listCounter.countWordsStartsWithA(Arrays.asList(""));
        assertEquals(0, count);
    }

}