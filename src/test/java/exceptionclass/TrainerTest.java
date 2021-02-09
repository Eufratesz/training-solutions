package exceptionclass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testCreate(){
        Trainer trainer = new Trainer("John Doe", 30);
        assertEquals("John Doe", trainer.getName());
        assertEquals(30, trainer.getAge());
    }

    @Test
    public void testInvalidAge(){
        Invalid2AgeException e = assertThrows(Invalid2AgeException.class,()->{
            new Trainer("John Doe", 15);
        });
        assertEquals("Invalid age by creating a trainer", e.getMessage());
        assertEquals(15, e.getParameterAge());
        assertEquals(18, e.getMinAge());
    }

}