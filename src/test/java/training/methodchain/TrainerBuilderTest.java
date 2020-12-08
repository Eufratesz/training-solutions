package training.methodchain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainerBuilderTest {

    @Test
    public void build() {
/*
        TrainerBuilder trainerBuilder = new TrainerBuilder().withName("John Doe").withAge(30);
        Trainer trainer = trainerBuilder.build();

        Egyszrűbben így is lehet:
 */
        Trainer trainer = new TrainerBuilder()
                .withName("John Doe")
                .withAge(30)
                .build();

        assertEquals("John Doe", trainer.getName());
        assertEquals(30, trainer.getAge());



    }
}
