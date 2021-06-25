package aaa.week06;

/*
Írj egy olyan metódust az ListSelector osztályban, mely egy kapott listából minden második elemet kiválogat, és egy
szövegként összerak, szögletes zárójelek között. A páros megállapítása index szerint működik. Azaz az első, nulla
indexű elem páros, a második, azaz egyes indexű elem páratlan, stb. Ha üres a lista, akkor üres stringet adjunk vissza.
 Ha a paraméterül kapott lista null, akkor dobj IllegalArgumentExceptiont a metódusban!
 */


import java.util.List;

public class ListSelector {

    public String selectEverySecond(List<String> words){
        StringBuilder sb = new StringBuilder();

        if(words == null){
            throw new IllegalArgumentException("list is null!");
        }
        if(words.size() != 0) {
            sb.append("[");
            for (int i = 0; i < words.size(); i += 2) {
                sb.append(words.get(i));
            }
            sb.append("]");
        }
        return sb.toString();
    }
}
