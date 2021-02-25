package algorithmtransform;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TransformationsTest {

    @Test
    void testToNames(){
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1980));

        List<String> names = new Transformations().toNames(trainers);
        //System.out.println(names);
        assertEquals(2, names.size());
        assertEquals("John Doe", trainers.get(0).getName());
        assertEquals("Jack Doe", trainers.get(1).getName());
    }
    @Test
    void testtoNamesYearOfBirtBefore(){
        List<Trainer> trainers = new ArrayList<>();
        trainers.add(new Trainer("John Doe", 1970));
        trainers.add(new Trainer("Jack Doe", 1980));

        List<String>names = new Transformations().toNamesYearOfBirtBefore(trainers, 1975);
        //System.out.println(names);
        assertEquals(1, names.size());
        assertEquals("John Doe", names.get(0));
    }

}