package training.staticattrmeth;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {
    @Test
    public void testCreate() {
        assertEquals(0, Trainer.getNumberOfTrainers());
        Trainer t = new Trainer ("John Doe");
        assertEquals(1, Trainer.getNumberOfTrainers());
        Trainer t2 = new Trainer ("Jane Doe");
        assertEquals(2, Trainer.getNumberOfTrainers());
    }


}
