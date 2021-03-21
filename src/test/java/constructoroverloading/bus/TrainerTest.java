package constructoroverloading.bus;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testCreate(){
        Trainer trainer = new Trainer("John Doe");
        assertEquals("John Doe", trainer.getName());
        assertEquals(20, trainer.getAge());
    }

}