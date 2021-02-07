package collectionsclass;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsTest {

    @Test
    public void testCollections(){
        /*
        List<Integer>l = Collections.emptyList(); //nem módosítható kollekciót ad vissza.
        l.add(1);  //UnsupportedOperatonException-t dob.

        List<Integer>l = Collections.singletonList(1);
        l.add(2); //UnsupportedOperatonException-t dob. Csak 1 elem lehet a singelonList-ben.
        l.set(0, 2) // kicserélni sem engedi az elemet.

         */

        List<Integer>elements = new ArrayList<>();
        elements.add(1);
        elements.add(2);
        List<Integer>l = Collections.unmodifiableList(elements);
        System.out.println(l);      //[1, 2]
        assertEquals(Arrays.asList(1,2) , l);

       // l.add(3); nem lehet hozzáadni az l nézethez..
        elements.add(3);
        System.out.println(elements); //[1, 2, 3]
        System.out.println(l);          //[1, 2, 3]
        assertEquals(Arrays.asList(1, 2, 3), l);
    }

    @Test
    public void testReverse() {
        List<Integer>l = Arrays.asList(1, 2, 3, 4);
        Collections.reverse(l);
        System.out.println(l);          //[4, 3, 2, 1]
    }

    @Test
    public void testShuffle(){
        List<Integer>l = Arrays.asList(1, 2, 3, 4);
        Collections.shuffle(l);
        System.out.println(l);  //véletlenszerűen keveri meg az elemeket.
    }

    @Test
    public void testShuffleRandom(){
        List<Integer>l = Arrays.asList(1, 2, 3, 4);
        Random random = new Random(5);
        Collections.shuffle(l, random);
        System.out.println(l);  //[4, 1, 2, 3] mindig ugyanezt adja vissza.
        assertEquals(Arrays.asList(4, 1, 2, 3), l);
    }

}