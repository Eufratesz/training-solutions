package training.introinheritance.trainer;

import org.junit.jupiter.api.Test;

import java.util.Collections;

public class TrainerTest {

    @Test
    public void testCreate(){
        System.out.println(new Trainer("John Doe", 31, Collections.emptyList()));

    }
}
