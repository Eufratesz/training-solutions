package extrapractice.controlselection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToConsonantTest {

    @Test
    void nextConsonant() {

        ToConsonant toConsonant = new ToConsonant();
        assertEquals('b', toConsonant.nextConsonant('a'));
        assertEquals('f', toConsonant.nextConsonant('e'));
        assertEquals('P', toConsonant.nextConsonant('O'));
        assertEquals('V', toConsonant.nextConsonant('U'));
    }
}