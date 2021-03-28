package inheritanceconstructor.demo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testCreate(){
       Trainer trainer = new Trainer("John Doe", 30, Arrays.asList(new Course("course 1")));
       trainer.work();
    }

}