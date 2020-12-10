package week07d04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

    public class LabTest {

        @Test
        public void testConstructorWithOneParameter() {
            Lab lab = new Lab("Öröklődés");

            assertEquals("Öröklődés", lab.getTitle());
            assertFalse(lab.isCompleted());
            assertEquals(null,lab.getCompletedAt());
        }

        @Test
        public void testconstructorWithTwoParameters() {
            Lab lab = new Lab("Öröklődés", LocalDate.of(2020,12,10));

            assertEquals("Öröklődés", lab.getTitle());
            assertEquals(LocalDate.of(2020,12,10), lab.getCompletedAt() );
            assertTrue(lab.isCompleted());

        }


        @Test
        public void testComplete() {
            Lab lab = new Lab("Öröklődés");

            lab.complete(LocalDate.of(2020,12,10));
            assertTrue(lab.isCompleted());
            assertEquals(LocalDate.of(2020,12,10), lab.getCompletedAt());
        }

        @Test
        public void testCompleteNow() {
            Lab lab = new Lab("Öröklődés");
            lab.complete();

            assertTrue(lab.isCompleted());
            assertEquals(LocalDate.now(), lab.getCompletedAt());
        }


    }


