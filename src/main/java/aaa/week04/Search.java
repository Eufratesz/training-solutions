package aaa.week04;

/*
A Search osztályban írj egy getIndexesOfChar() metódust, mely első paraméterként vár egy String értéket, második
paraméterként egy char értéket! Visszaad egy listát, melyben visszaadja, hogy a karakter hanyadik indexeken szerepel
az első paraméterként átadott listában.
Pl.: almafa szóban a a karakter: 0, 3, 5.

 */

import java.util.ArrayList;
import java.util.List;

public class Search {

    public List<Integer> getIndexesOfChar(String word, char letter) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==letter ) {
                indexes.add(i);
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        Search search = new Search();
        System.out.println(search.getIndexesOfChar("almafa", 'a'));
        System.out.println(search.getIndexesOfChar("eszméletlen", 'e')); //0, 6, 9
    }


}
