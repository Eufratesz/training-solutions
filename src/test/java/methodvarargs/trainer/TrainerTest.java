package methodvarargs.trainer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    @Test
    public void testAddCourse(){
        Trainer trainer = new Trainer("John Doe");
        trainer.addCourse("Course1");

        assertEquals(1, trainer.getCourses().size());
    }
    @Test
    public void testAddCourses(){
        Trainer trainer = new Trainer("John Doe");
        trainer.addCourses("S1","Course1", "Course 2", "Course3");
        assertEquals(3, trainer.getCourses().size());
    }

}