package algorithmscount.letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterTest {

    @Test
    void countLetters() {
        LetterCounter letterCounter = new LetterCounter();

        assertEquals(2, letterCounter.countLetters("Kiskunlacháza", 'a'));
        assertEquals(3, letterCounter.countLetters("megetette", 't'));
    }
}