/*
Készíts week08d03 csomagban egy StringLists osztályt és benne egy stringListsUnion(List<String> first,
List<String> second) metódust, mely két string listát vár paraméterül és visszaadja az uniójukat.
Az uniónak minden elemet tartalmaznia kell mindkét listából, de egy elem nem szerepelhet kétszer!
 */
package week08d03;

import java.util.ArrayList;
import java.util.List;

public class StringLists {


    public List<String>stringListUnion(List<String>first, List<String>second) {
        List<String>union = new ArrayList<>();
        union.addAll(first);
        for(String string : second) {
            if(!union.contains(string)) {
                union.add(string);
            }
        }
        return union;
    }
}
