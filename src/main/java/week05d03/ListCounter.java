package week05d03;


import java.util.List;

public class ListCounter {


    public int counter(List<String>wordList) {
        int found = 0;

        for (String s : wordList) {
            if (s.toLowerCase().startsWith("a")){
                found++;
            }
        }
        return found;
    }

}


/*Junior és Mid-Level csoport mai feladata:
Írj egy olyan metódust az week05d03.ListCounter osztályban, mely egy kapott Listából (String)
összeszámolja azokat amik 'a' vagy 'A' betűvel kezdődnek,
Ha nulla elemű a tömb,vagy nincs benne ilyen elem, akkor 0-t adjon vissza.

 */