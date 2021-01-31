package collectionsset.collecionshashset;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
/*
    @Test
    public void testSet(){
        Set<String> s = new HashSet<>();

        Collection<String> c = s;
        s.add("John");
        s.add("Jack");
        s.add("John");
        System.out.println(s);

        Set<Trainer> trainerSet = new HashSet<>();
        trainerSet.add(new Trainer("Jack"));        //két különböző objektum, ezért kétszer írja ki.
        trainerSet.add(new Trainer("Jack"));
        System.out.println(trainerSet);

        //Ha a Trainer osztályban override-olom az equals()-t, a két objektum meg fog egyezni, csak egyszer írja ki.
        assertEquals(1, trainerSet.size());

    }

 */

    @Test
    public void tesSetOrder(){
        Set<Trainer> s = new LinkedHashSet<>();
        s.add(new Trainer("Jane"));
        s.add(new Trainer("Jack"));
        System.out.println(s);

        for(Trainer t: s){
            System.out.println(t.getName());
        }
    }

}