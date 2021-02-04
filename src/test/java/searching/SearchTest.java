package searching;

import org.junit.jupiter.api.Test;
import searching.trainer.Trainer;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class SearchTest {

    @Test
    public void testArraySearch(){
        int[]i = {1, 3, 5, 6, 7, 9, 12,4};

        Arrays.sort(i); // Ha nem rendezett a tömb, előbb rendezni kell


        int index = Arrays.binarySearch(i, 5);
        System.out.println(index);

        int index2 = Arrays.binarySearch(i, 20);
        System.out.println(index2);             //-8 értéket ad vissza


        assertEquals(3, Arrays.binarySearch(i, 5));
        assertEquals(true, Arrays.binarySearch(i, 20) < 0);
    }

    @Test
    public void testListSearch() {
        List<Integer> j = Arrays.asList(1, 3, 5, 6, 7, 9, 12);
        Collections.binarySearch(j, 6);
        assertEquals(3, Collections.binarySearch(j, 6));

        assertEquals(true, j.contains(6));
        assertEquals(false, j.contains(20));

        assertEquals(true, j.containsAll(Arrays.asList(1, 7)));
        assertEquals(false, j.containsAll(Arrays.asList(1, 20)));
//Keresés index alapján:
        assertEquals(3, j.indexOf(6));              //A 6 a 3.indexű elem
        assertEquals(true, j.indexOf(20) < 0);  // A 20 nem szerepel a listában.
//legkisebb és legnagyobb érték keresése:
        assertEquals(1, Collections.min(j));
        assertEquals(12, Collections.max(j));

    }
        @Test
        void testTrainerList(){
            List<Trainer> trainers = Arrays.asList(
                    new Trainer("John", 3),
                    new Trainer("Jack", 2),
                    new Trainer("Jane", 1)
            );
            assertEquals("John", Collections.max(trainers).getName());      //A név alapján van implementálva az összehasonlítás a Trainer osztályban.
            assertEquals("Jack", Collections.min(trainers).getName());

            assertEquals("Jane", Collections.min(trainers, new Comparator<Trainer>() {
                @Override
                public int compare(Trainer o1, Trainer o2) {
                    return o1.getSalary()- o2.getSalary();
                }
            }).getName());


        }
    }
