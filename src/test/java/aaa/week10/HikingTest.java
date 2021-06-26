package aaa.week10;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class HikingTest {

    @Test
    void testGetPlusElevation() {
        Hiking hiking = new Hiking();
        double result = hiking.getPlusElevation(Arrays.asList(10.0, 20.0, 15.0, 18.0));
        assertEquals(13L, result);

    }
}