package methodchain.robot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerBuilderTest {

    @Test
    public void build(){
//        TrainerBuilder trainerBuilder = new TrainerBuilder().withName("John Doe").withAge(30);
//        Trainer trainer = trainerBuilder.build();

        Trainer trainer = new TrainerBuilder()
                .withName("John Doe")
                .withAge(30)
                .build();

        assertEquals("John Doe", trainer.getName());
    }

}