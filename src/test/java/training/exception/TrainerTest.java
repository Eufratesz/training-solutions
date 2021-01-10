package training.exception;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testInvalidAge() {
        InvalidAgeException e = assertThrows(InvalidAgeException.class, ()-> {
            new Trainer ("Sarah Jones", 16);
        });
        assertEquals("Invalid age by creating a trainer", e.getMessage());
        assertEquals(16, e.getParameterAge());
        assertEquals(18, e.getMinAge());
    }


    @Test
    public void testCreate() {
        Trainer trainer = new Trainer("John Smith", 25);
        assertEquals(25, trainer.getAge());
        assertEquals("John Smith", trainer.getName());

    }

}