package collectionslist.trainer;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {

    @Test
    public void testList(){
        //List<String>list = new ArrayList<>();

        List<String>list = new LinkedList<>(); //ugyanúgy lefut minden teszteset.
                list.add("John");
        list.add("Jack");
        assertEquals(Arrays.asList("John", "Jack"), list);

        Collection<String>c = list;
        c.add("Jane");
        assertEquals(Arrays.asList("John", "Jack", "Jane"), list);

        c.remove("John");
        assertEquals(Arrays.asList("Jack", "Jane"), list);
        assertEquals(2, list.size());
        assertFalse(c.isEmpty());
        assertTrue(c.contains("Jane"));

        c.clear();
        assertTrue(c.isEmpty());

        list.add("John");
        list.add("Jane");
        list.add(0,"Jackson");
        assertEquals(Arrays.asList("Jackson", "John", "Jane"), list);
        assertEquals("John", list.get(1));
        assertEquals(2, list.indexOf("Jane"));

        list.add("Jackson");
        assertEquals(0, list.indexOf("Jackson"));
        assertEquals(3, list.lastIndexOf("Jackson"));

        list.remove(0);
        assertEquals(Arrays.asList("John", "Jane", "Jackson"), list);

        list.set(1, "Joe");  //1.indexű elemet ("Jane") kicseréljük "John"-ra.
        assertEquals(Arrays.asList("John", "Joe", "Jackson"), list);

    }

}