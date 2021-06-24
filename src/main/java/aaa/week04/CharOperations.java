package aaa.week04;
/*
Írj egy CharOperations osztályt, abban egy List<Integer> getPositionOfChars(String base, String part) metódust!
A metódus visszaadja, hogy az első stringben a második string mely pozíciókon helyezkedik el.
 */

import java.util.ArrayList;
import java.util.List;

public class CharOperations {

    List<Integer> getPositionOfChars(String base, String part){
        List<Integer> positionsOfChars = new ArrayList<>();
        for(int i = 0; i < base.length(); i++){
            int index = base.indexOf(part);
            if (base.substring(i, i+part.length()).equals(part)){
                positionsOfChars.add(i);
            }
        }
        return positionsOfChars;
    }

    public static void main(String[] args) {
        CharOperations charOperations = new CharOperations();
        List<Integer> result = charOperations.getPositionOfChars("alma", "a");
        System.out.println(result.toString());
    }


}
