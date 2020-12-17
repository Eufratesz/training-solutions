package training.inheritanceconstructor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {

    @Test
    public void testCreateHuman() {
     //   Human human = new Trainer();

    }

    @Test
    public void testCreateTrainer() {
        Trainer trainer = new Trainer("John Doe", 30, Arrays.asList(new Course()));
        assertEquals(4, trainer.getFreeTime());
        assertEquals("John Doe", trainer.getName());
    }
}
