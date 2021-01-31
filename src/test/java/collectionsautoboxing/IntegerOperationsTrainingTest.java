package collectionsautoboxing;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class IntegerOperationsTrainingTest {

    @Test
    public void testAutoboxing() {
        List<Integer> l = new ArrayList<>();
        Integer i = Integer.valueOf(5);
        Integer j = 5;  //aoutoboxing
        l.add(i);
        l.add(6);   //aoutoboxing

        int k = l.get(0);       // autounboxing

        assertEquals(5, i);
        assertEquals(5, j);
        assertEquals(2, l.size());

        for (int a : l) {
            System.out.println(a);
        }

        l.add(null);
        assertEquals(null, l.get(2));
    }
/*
        @Test
        public void testMap(){
            Map<Character, Integer>m = new HashMap<>();
            //
        m.put('a', 1);
        m.put('a', m.get('a')+1);  //lekérjük az előző értéket, hozzáadunk 1-et, és ezt tesszük vissza.
            assertEquals(2, m.get('a'));
        }

 */

    }



