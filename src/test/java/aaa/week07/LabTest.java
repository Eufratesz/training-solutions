package aaa.week07;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    void testConstructorWithDate() {
        Lab lab = new Lab("method", LocalDate.of(2021, 10, 20));
        assertEquals("method", lab.getTitle());
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.of(2021, 10, 20), lab.getCompletedAt());
    }

        @Test
        void testConstructorWithoutDate(){
        Lab lab1 = new Lab("constructor");
        assertEquals("constructor", lab1.getTitle());
        assertFalse(lab1.isCompleted());
        assertEquals(null, lab1.getCompletedAt());

    }

    @Test
    void testCompleteWithDate() {
        Lab lab = new Lab("method", LocalDate.of(2021,10,20));
        lab.complete(LocalDate.of(2021,10,20));
        assertTrue(lab.isCompleted());
       assertEquals(LocalDate.of(2021,10,20), lab.getCompletedAt());

    }

    @Test
    void testCompleteWithoutDate() {
        Lab lab = new Lab("constructor");
        lab.complete();
        assertTrue(lab.isCompleted());
        assertEquals(LocalDate.now(), lab.getCompletedAt());


    }
}