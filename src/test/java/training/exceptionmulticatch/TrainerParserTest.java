package training.exceptionmulticatch;

import org.junit.jupiter.api.Test;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class TrainerParserTest {

    /*
    A videon a régi szerint van, ezt nem tudom így megírni.
   @Test
    public void testNull() {
        Trainer trainer = new TrainerParser().parse(null);
        assertThrows(NullPointerException);
    }

     */

    @Test
    public void testValid(){
        Trainer trainer = new TrainerParser().parse("John Doe;30");
        assertEquals("John Doe", trainer.getName());
        assertEquals(30, trainer.getAge());
    }

}