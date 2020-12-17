package week08d04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerTest {


    @Test
    public void TestGiveMark() {
        Trainer trainer = new Trainer(new GoodMood());
        Trainer anotherTrainer = new Trainer (new BadMood());

        assertEquals(5, trainer.giveMark());
        assertEquals(3, anotherTrainer.giveMark());

    }

}

