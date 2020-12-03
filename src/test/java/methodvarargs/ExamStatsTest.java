
package methodvarargs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExamStatsTest {

    private ExamStats examStats;

    @BeforeEach
    public void setUp() {
        this.examStats = new ExamStats(100);
    }

    @AfterEach
    public void tearDown() {
        this.examStats = null;
    }
//innentől másoltam a megoldókulcsból:
    @Test
    public void zeroResultShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->examStats.getNumberOfTopGrades(85));
        assertEquals("Number of results must not be empty!", ex.getMessage());
    }

    @Test
    public void nullResultShouldThrowException() throws IllegalArgumentException {
        Exception ex = assertThrows(IllegalArgumentException.class, () ->examStats.getNumberOfTopGrades(85, null));
        assertEquals("Number of results must not be empty!", ex.getMessage());
    }


    //innentől ment egyedül:
    @Test
    public void testGetNumberOfTopGrades() {
        int limitInPercent = 60;

        List<Integer> results = new ArrayList<>();
        results.add(40);
        results.add(70);
        results.add(20);
        results.add(90);

        assertEquals(2, examStats.getNumberOfTopGrades(60, 40, 70, 20, 90));
        assertEquals(1, examStats.getNumberOfTopGrades(85, 40, 70, 20, 90));

    }


    @Test
    public void testHasAnyFailed() {

        assertEquals(true, examStats.hasAnyFailed(60, 40, 70, 20, 90));
        assertEquals(false, examStats.hasAnyFailed(50, 55, 60, 70, 80, 95));
    }


//Eddig önállóan ment, innentől a megoldókulcs alapján:

    @Test
    public void zeroResultsShouldThrowExceptionWithFails() throws IllegalArgumentException {

        Exception ex = assertThrows(IllegalArgumentException.class, () -> examStats.hasAnyFailed(50));
        assertEquals("Number of results must not be empty!", ex.getMessage());
    }


}
