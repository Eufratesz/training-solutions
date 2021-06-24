package aaa.week05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangeLetterTest {

    @Test
    void testChangeLetter(){
        ChangeLetter changeLetter = new ChangeLetter();
        String newText = changeLetter.changeVowels("eperfalombja");
        assertEquals("*p*rf*l*mbj*", newText);
    }

}