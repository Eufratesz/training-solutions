/*
Írj egy olyan metódust az week06d01.ListSelector osztályban, mely egy kapott listából minden második elemet kiválogat,
és egy szövegként összerak, szögletes zárójelek között.
A páros megállapítása index szerint működik. Azaz az első, nulla indexű elem páros, a második,
azaz egyes indexű elem páratlan, stb.
Ha üres a lista, akkor üres stringet adjunk vissza. Ha a paraméterül kapott lista null, akkor dobjunk
IllegalArgumentExceptiont a metódusban.

public int counter(List<String>wordList) {
        int found = 0;

        for (String s : wordList) {
            if (s.toLowerCase().startsWith("a")){
                found++;
            }
        }
        return found;
*/

package week06d01;

import java.util.List;

public class ListSelector {


    public String selector(List<String>wordList) {
        StringBuilder result = new StringBuilder();

        if(wordList == null) {
            throw new IllegalArgumentException(("Null is not accepted!"));
        }
        if (wordList.size() !=0) {
            result.append("[");
            for(int i = 0; i < wordList.size(); i+=2) {
                result.append(wordList.get(i));
            }
            result.append("]");
        }
        return result.toString();

//üres a lista, null a lista, rendben a lista





    }

    public static void main(String[] args) {

    }

}
