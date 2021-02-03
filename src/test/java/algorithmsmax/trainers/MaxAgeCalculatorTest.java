package algorithmsmax.trainers;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MaxAgeCalculatorTest {

    @Test
    void TestTrainerWithMaxAge() {
        //Given
        List<Trainer> trainers = Arrays.asList(
                new Trainer("Joe", 16),
                new Trainer("Jim", 26),
                new Trainer("Johann", 21),
                new Trainer("Jane", 20),
                new Trainer("Jonathan", 36),
                new Trainer("Joseph", 56),
                new Trainer("Jasmine", 30)
        );
        //When
        MaxAgeCalculator mxc = new MaxAgeCalculator();
        //Then
        assertEquals(56, mxc.trainerWithMaxAge(trainers).getAge());
        assertEquals("Joseph", mxc.trainerWithMaxAge(trainers).getName());
    }
}