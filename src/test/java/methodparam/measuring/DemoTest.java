package methodparam.measuring;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    public void testCreateEmployee(){
        new Demo().createEmployee("John Doe", 1970, EmployeeType.FULL_TIME);
    }

    @Test
    public void testFindEmployee(){
        List<String>names = Arrays.asList("John Doe", "Jane Doe", "Jack Doe");
//        Demo demo = new Demo();
//        assertEquals("Jane Doe",  demo.findEmployee("Jan", names));

        Result result = new Demo().findEmployee("John Doe", names);
        assertEquals("John Doe", result.getName());
        assertEquals(0, result.getIndex());

    }

}