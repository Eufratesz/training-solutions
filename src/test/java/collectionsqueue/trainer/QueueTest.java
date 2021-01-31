package collectionsqueue.trainer;

import org.junit.jupiter.api.Test;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    public void testQueue() {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        int i = q.element();
        assertEquals(1, i);

        i = q.element();
        assertEquals(1, i);  //Ugyanúgy ott van, csak kiolvasta, nem távolította el az 1. elemet.

        i= q.remove();
        assertEquals(1, i);

        i= q.remove();
        assertEquals(2, i);

        assertEquals(0, q.size());
        assertTrue(q.isEmpty());
    }

    @Test
    public void testStack(){
        Deque<Integer>d = new LinkedList<>();
        d.push(1);  //a verem tetejére beteszi az új értéket.
        d.push(2);
        d.push(3);

        int i = d.peek();  //kiválasztja de bennehagyja.
        assertEquals(i, 3);
        i = d.peek();
        assertEquals(i, 3);  // bennmaradt, csak kiválasztotta az utolsónak betett elemet.
        i = d.pop();
        assertEquals(i, 3);   //Kiszedi az utolsó értéket, a 3-at.
        i = d.pop();
        assertEquals(i, 2);
        i = d.pop();
        assertEquals(i, 1);  //kiszedi az 1-et, a legelőször berakott elemet.
        assertEquals(true, d.isEmpty());         //Üres a lista.

    }

}