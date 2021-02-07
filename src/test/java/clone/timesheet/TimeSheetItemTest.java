package clone.timesheet;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TimeSheetItemTest {

    TimeSheetItem timeSheetItem = new TimeSheetItem("Jim Smith", "Second Wolrd War",
            LocalDateTime.of(2020, 1,11, 8,0),
            LocalDateTime.of(2020,1,1, 10,30));

    @Test
    void testCreateWithData() {
        assertEquals("Jim Smith", timeSheetItem.getEmployee());
        assertEquals("Second Wolrd War", timeSheetItem.getProject());
        assertEquals(LocalDateTime.of(2020, 1,11, 8,0), timeSheetItem.getFrom());
        assertEquals(LocalDateTime.of(2020,1,1, 10,30), timeSheetItem.getTo());
    }

    @Test
    void testCreateBasedOnTimeSheetItem(){
        //When
        TimeSheetItem anotherTimeSheetItem = new TimeSheetItem(timeSheetItem);
        //Then
        assertEquals("Jim Smith", anotherTimeSheetItem.getEmployee());
        assertEquals("Second Wolrd War", anotherTimeSheetItem.getProject());
        assertEquals(LocalDateTime.of(2020, 1,11, 8,0), anotherTimeSheetItem.getFrom());
        assertEquals(LocalDateTime.of(2020,1,1, 10,30), anotherTimeSheetItem.getTo());
    }

    @Test
    void withDifferentDay() {
        //When
        TimeSheetItem anotherTimeSheetItem = TimeSheetItem.withDifferentDay(timeSheetItem, LocalDate.of(2021,2,2));
        assertEquals("Jim Smith", anotherTimeSheetItem.getEmployee());
        assertEquals("Second Wolrd War", anotherTimeSheetItem.getProject());
        assertEquals(LocalDateTime.of(2021, 2,2, 8,0), anotherTimeSheetItem.getFrom());
        assertEquals(LocalDateTime.of(2021,2,2, 10,30), anotherTimeSheetItem.getTo());

    }
}