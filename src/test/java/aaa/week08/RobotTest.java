package aaa.week08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobotTest {

    @Test
    void testMove() {

        Robot robot = new Robot();
        robot.move("FFLLLLLBBBBJJJJJJJ");
        assertEquals(3, robot.getPosition().getX());
        assertEquals(-3, robot.getPosition().getY());

    }

    @Test
    void testWrongMove() {

        Robot robot = new Robot();
        robot.move("FFLLLLDBBBBJJJJJJJ");
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class, () -> robot.move("FFLLLLDBBBBJJJJJJJ"));
        assertEquals("Unknown movement", iae.getMessage());

    }
}