package algorithmscount.trainers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AgeConditionCounterTest {

    @Test
    void TestCountElderThan() {
        AgeConditionCounter ac = new AgeConditionCounter();
        List<Trainer>trainers = new ArrayList<>(Arrays.asList(
                new Trainer("John", 16),
                new Trainer("Jim", 36),
                new Trainer("Jonathan", 28),
                new Trainer("Johann", 6)
                ));
        assertEquals(2, ac.countElderThan(trainers, 18));
    }
}