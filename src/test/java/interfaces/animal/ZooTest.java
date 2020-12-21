package interfaces.animal;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZooTest {

    @Test
    public void getNumberOfAnimals() {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Duck());
        animals.add(new Lion());
        animals.add(new Worm());
        Zoo zoo = new Zoo(animals);

        assertEquals(3, zoo.getNumberOfAnimal());

    }

    @Test
    public void testGetNumberOfLegs() {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Duck());
        animals.add(new Lion());
        animals.add(new Worm());
        Zoo zoo = new Zoo(animals);

        assertEquals(6, zoo.getNumberOfLegs());
    }

    //Ezt a tesztet kifelejtettem.
    @Test
    public void testGetNumberOfLegsWithEmptyList() {
        List<Animal> animals = new ArrayList<>();
        Zoo zoo = new Zoo(animals);

        assertEquals(0, zoo.getNumberOfLegs());

    }
}
