package training.abstractclass;

import org.junit.jupiter.api.Test;
import training.inheritanceconstructor.Course;

import java.util.ArrayList;
import java.util.Arrays;

public class TrainerTest {

    @Test
    public void testCreate() {
     //   Human human = new Trainer("John Doe", 30, Arrays.asList(new Courses()));
     //       human.work();

        Trainer trainer = new Trainer("John Doe", 30, Arrays.asList(new Courses()));
        trainer.work();
        }
    }
