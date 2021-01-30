package week13d05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DifferentLettersTest {

@Test
    void letterCounterTest(){
    DifferentLetters differentLetters = new DifferentLetters();


    assertEquals(3, differentLetters.countLetters("alma"));
    assertEquals(9, differentLetters.countLetters("watermelon"));

}

}