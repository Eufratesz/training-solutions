package collectionsiterator;

import org.junit.jupiter.api.Test;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    @Test
    public void testRemove(){
        List<Integer>l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        Iterator<Integer> i = l.iterator();
        while(i.hasNext()) {
            int j = i.next();
            if(j % 2 == 0){
                i.remove();
        }
    }
        assertEquals(Arrays.asList(1, 3, 5, 7), l);

}
}
/*
    @Test
    public void testRemove(){
        List<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        for(int i : l) {
            if( i % 2 ==0){
                l.remove(Integer.valueOf(i));  //ConcurrentModificationException-t dob, mert ciklusbejárás közben módosítom a listát.
            }
        }

    }

 */
