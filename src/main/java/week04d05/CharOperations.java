package week04d05;

/*
adott egy String. A paraméterül átadott betű hányadik pozíción van benne.
Pl "alma"(base), 'a'(part)
 */

import java.util.ArrayList;
import java.util.List;

public class CharOperations {

    public List<Integer> getPositionOfChar(String base, String part){
        List<Integer>result = new ArrayList<>();
        for(int i = 0; i < base.length()-part.length()+1; i++) {
            if(base.substring(i, i+part.length()).equals(part)) {
                result.add(i);

            }
        }

        return result;
    }
}
