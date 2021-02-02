package collectionscomp.trainer;

import org.junit.jupiter.api.Test;

import java.text.Collator;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TrainersTest {
    @Test
    void testSort(){
        List<String>names= Arrays.asList("Joe","Jack", "Jane");

        Collections.sort(names);
        assertEquals(Arrays.asList("Jack","Jane","Joe"), names);


    }

    @Test
    void testTrainerSort(){
        List<Trainer> trainers =Arrays.asList(
                new Trainer("Joe", 3),
                new Trainer("Jack", 2),
                new Trainer("Jane", 1)
        );
        Collections.sort(trainers);
        assertEquals("Jack", trainers.get(0).getName());

     //   Collections.sort(trainers, new SalaryComparator());
      //  System.out.println(trainers);

        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.salary - o2.salary;

            }

        });
        assertEquals("Jane", trainers.get(0).getName());

        Collections.sort(trainers, new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.name.length()-o2.name.length();
            }
        });
        assertEquals("Joe", trainers.get(0).getName());
    }



    public class SalaryComparator implements Comparator<Trainer> {
        @Override
        public int compare(Trainer o1, Trainer o2) {
            return o1.salary - o2.salary;
        }
    }

    @Test
    void testSortWithAccutes(){
        List<String>names= Arrays.asList("Joe","Jack", "Jane","Ábel", "éva", "joe", "jack");
/*
        Collections.sort(names);
        assertEquals(Arrays.asList("Jack","Jane","Joe", "jack", "joe", "Ábel","éva"), names);
        //először az összes nagybetű, utána a kisbetúk, majd az ékezetesek: nagybetű, kisbetű ott is.


 */
        Collections.sort(names, Collator.getInstance(new Locale("hu", "HU")));
        assertEquals(Arrays.asList("Ábel", "éva","jack", "Jack", "Jane", "joe","Joe"), names);
//az ékezetesek a helyükre kerültek, előbb a kisbetűs, utána a nagybetűs
    }

}