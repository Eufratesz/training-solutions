package genericsusage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGenericUsage {

    @Test
    public void testGenericsUsage(){
//        List l = new ArrayList();
//        l.add(10);
//        l.add("John Doe");
//        l.add("Jane Doe");
//
//        String s = (String)l.get(0);      //ClassCastException
//        System.out.println(s);

        List<String> l = new ArrayList<>();
        l.add("John Doe");
        l.add("Jane Doe");

        String s = l.get(0);
        assertEquals(s, "John Doe");

        List<String> l2 = new ArrayList<>();
        Collection<String> l3 = l2;
    }
}
