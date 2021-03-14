package extrapractice.controlselection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WithoutAccentTest {

    @Test
    void changeAccent() {

        WithoutAccent wa = new WithoutAccent();

        assertEquals('a', wa.changeAccent('a'));
        assertEquals('a', wa.changeAccent('á'));
        assertEquals('U', wa.changeAccent('U'));
        assertEquals('Ü', wa.changeAccent('Ű'));

    }
}