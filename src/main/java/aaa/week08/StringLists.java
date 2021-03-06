package aaa.week08;

/*
Készíts week08d03 csomagban egy StringLists osztályt és benne egy
stringListsUnion(List<String> first, List<String> second) metódust, mely két string listát vár paraméterül és
visszaadja az uniójukat. Az uniónak minden elemet tartalmaznia kell mindkét listából, de egy elem nem szerepelhet kétszer!
 */

import java.util.ArrayList;
import java.util.List;

public class StringLists {


    public List<String> stringListsUnion(List<String> first, List<String> second) {
        List<String> union = new ArrayList<>(first);

        for (String s : second) {
            if (!union.contains(s)) {
                union.add(s);
            }
        }
        return union;
    }
}
