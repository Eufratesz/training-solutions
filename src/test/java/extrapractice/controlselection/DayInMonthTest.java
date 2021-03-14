package extrapractice.controlselection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayInMonthTest {

    @Test
    void testNumberOfDaysInMonth() {


    DayInMonth dayInMonth = new DayInMonth();

    assertEquals(31, dayInMonth.numberOfDaysInMonth(2020,"január"));
    assertEquals(31, dayInMonth.numberOfDaysInMonth(2020,"március"));
    assertEquals(30, dayInMonth.numberOfDaysInMonth(2020,"november"));
    assertEquals(29, dayInMonth.numberOfDaysInMonth(2020,"február"));
    assertEquals(28, dayInMonth.numberOfDaysInMonth(2021,"február"));
    assertEquals(29, dayInMonth.numberOfDaysInMonth(800,"február"));



}

}