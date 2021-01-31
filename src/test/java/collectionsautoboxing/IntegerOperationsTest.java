package collectionsautoboxing;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IntegerOperationsTest {

    @Test
    void TestcreateList() {
        //Given
        List<Integer> integerList = new IntegerOperations().createList(1,23,12);

        //Then
        assertEquals(3, integerList.size());
        assertEquals(23, integerList.get(1));

    }

    @Test
    void testSumIntegerList() {
        //Given
        IntegerOperations autobox = new IntegerOperations();
        //Then
        assertEquals(36, autobox.sumIntegerList(autobox.createList(1,23,12)));
    }

    @Test
    void sumIntegerObjects() {
        assertEquals(36, new IntegerOperations().sumIntegerObjects(1,23,12));
    }
}