package methodpass;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {


    @Test
    public void testTryChangeValues(){
        int originalYearOfBirth = 1980;
        String originalname = "Jack";
        List<String> originalCourses = new ArrayList<>();
        new Demo().tryChangeValues(originalYearOfBirth, originalname, originalCourses);

        assertEquals(1980, originalYearOfBirth);
        assertEquals("Jack", originalname);
        assertEquals(1, originalCourses.size());
    }
}