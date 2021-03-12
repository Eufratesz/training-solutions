package extrapractice.introcontrol;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class IntroControlTest {

IntroControl introControl = new IntroControl();
    @Test
    void subtractTenIfGreaterThanTen() {

        assertEquals(10, introControl.subtractTenIfGreaterThanTen(20));
        assertEquals(9, introControl.subtractTenIfGreaterThanTen(9));
        assertEquals(10, introControl.subtractTenIfGreaterThanTen(10));
        assertEquals(-1, introControl.subtractTenIfGreaterThanTen(-1));
    }

    @Test
    void testDescribeNumber(){
        assertEquals("zero", introControl.describeNumber(0));
        assertEquals("not zero", introControl.describeNumber(-1));
        assertEquals("not zero", introControl.describeNumber(10));

    }

    @Test
    void testGreetingJoe(){
        assertEquals("Hello Joe", introControl.greetingJoe("Joe"));
        assertEquals("", introControl.greetingJoe("NotJoe"));
    }

    @Test
    void testCalculateBonus(){
        assertEquals(100_000, introControl.calculateBonus(1_000_000));
        assertEquals(0, introControl.calculateBonus(1_000));
    }

    @Test
    void testCalculateConsumption(){
        assertEquals( 10, introControl.calculateConsumption(90, 100));
        assertEquals( 20, introControl.calculateConsumption(9990, 10));
    }



}