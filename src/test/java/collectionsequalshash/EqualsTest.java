package collectionsequalshash;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EqualsTest {

    @Test
    public void testEquals(){
      //  String s = new String("John");  //két különböző objektumra mutat.
      //  String s2 = new String ("John");
       // assertEquals(true, s.equals(s2));

        Trainer trainer = new Trainer("John Doe", 2000);
        Trainer trainer2 = new Trainer("John Doe", 1990);
       // assertEquals(false, trainer == trainer2);
       // assertEquals(true, trainer.equals(trainer2));  //Override után
        //assertEquals(false, trainer.equals(null));
        assertEquals(false, trainer.equals(trainer2));
        Trainer trainer3 = new Trainer("John Doe", 2000);
        assertEquals(true, trainer.equals(trainer3));


        List<Integer> l = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(1, 2, 3);
        assertEquals(true, l.equals(l2));



    }

    @Test
    public void testHashCode(){
        Trainer trainer = new Trainer("John Doe", 1990);
        //System.out.println(trainer.hashCode());
        System.out.println(trainer);  //osztály neve, kukac, hashcode(Memóriacím)

        Trainer trainer1 = new Trainer("John Doe", 1990);
        System.out.println(trainer1);           // a két trainer hashcode-ja eltér.
        //Override után a két trainer hashcode-ja megegyezik.

        assertEquals(true, trainer.hashCode() == trainer1.hashCode());
        Trainer trainer2 = new Trainer("John Doe", 2000);
        assertEquals(false, trainer.equals(trainer2));
    }
}