package ioreadwritebytes.temperatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturesTest {

    private byte[]data = new byte[365];

    @BeforeEach
    public void initData(){                 //ezt kifelejtettem, de már OK.
        Random random = new Random(10);
        random.nextBytes(data);
    }

    @Test
    public void testGetYearAverage() {
        Temperatures temperatures = new Temperatures(data);

        double YearAverage= temperatures.getYearAverage();
        assertEquals(3.6575, YearAverage, 0.0001);       // a deltát lefelejtettem.

    }

    @Test
    public void testGetMonthAverage() {
        Temperatures temperatures = new Temperatures(data);

        double MonthAverage = temperatures.getMonthAverage();
        assertEquals(9.2, MonthAverage, 0.0001);
    }

}