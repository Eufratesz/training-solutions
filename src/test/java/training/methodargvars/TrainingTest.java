package training.methodargvars;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrainingTest {

    @Test
            public void testAddCourse() {
        Trainer trainer = new Trainer("John Doe");

        trainer.addCourses("C1", "C2", "C3");


        assertEquals(3, trainer.getCourses().size());
    }
}
