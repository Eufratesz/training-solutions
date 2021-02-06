package sorting;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {


    @Test
    public void testSortArray(){
        int[]i = {3, 1, 6, 9, 5, 3};
        Arrays.sort(i);
        assertArrayEquals(new int[]{1, 3, 3, 5, 6, 9}, i);  //Tömbök összehasonlításánál az assertEquals nem működik, csak az assertArrayEquals
    }

    @Test
    public void testSortList() {
        List<Integer>i = Arrays.asList(3, 1, 6, 9, 5, 3);
        Collections.sort(i);
        assertEquals(Arrays.asList(1, 3, 3, 5, 6, 9), i);
        i = Arrays.asList(1, 3, 3, 5, 6, 9);
        i.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 -o2;
            }
        });
        assertEquals(Arrays.asList(1, 3, 3, 5, 6, 9), i);
    }

    @Test
            void testSetNaturalOrdering() {
        Set<String> names = new TreeSet<>();
        names.add("Jack");
        names.add("Joe");
        names.add("Jane");
        System.out.println(names);          //[Jack, Jane, Joe]
    }



    @Test
    public void testSet(){
        Set<String>s = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();       //Hossz alapján kerül rendezésre: [Joe, Jack]  A négybetűsből a később jövő felülírja a korábbit.
            }
        });
        s.add("Jack");
        s.add("Joe");
        s.add("Jane");
        System.out.println(s);
    }

    @Test
    void testSetTrainer(){ //Trainerben implementálva a Comparable, név alapján hasonlítja össze az elemeket.
        Set<Trainer> trainers = new TreeSet<>();
        trainers.add(new Trainer("Jack", 3));
        trainers.add(new Trainer("Joe", 2));
        trainers.add(new Trainer ("Jane", 1));
        System.out.println(trainers);               //[Trainer{name='Jack', salary=3}, Trainer{name='Jane', salary=1}, Trainer{name='Joe', salary=2}]


    }

    @Test
    void testSetTrainerComparatorHere(){
        Set<Trainer> trainers = new TreeSet<>(new Comparator<Trainer>() {
            @Override
            public int compare(Trainer o1, Trainer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        trainers.add(new Trainer("Jack", 3));
        trainers.add(new Trainer("Joe", 2));
        trainers.add(new Trainer ("Jane", 1));
        System.out.println(trainers);               //[Trainer{name='Jack', salary=3}, Trainer{name='Jane', salary=1}, Trainer{name='Joe', salary=2}]


    }


}