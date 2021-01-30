package week13d05;
/*
Junior (adatszerkezetes) feladat:
Írj egy metódust, amely megszámolja, hogy hány különböző betű van
egy szóban. A kis és nagybetűk közötti különbség nem számít!
A space-eket, számjegyeket, stb. ne vegye figyelembe! Csak az
angol ábécé betűit! (edited)
 */

import java.util.HashSet;
import java.util.Set;

public class DifferentLetters {

    public int countLetters(String word) {
        char[] charArray = word.toLowerCase().toCharArray();
        Set<Character> mySet = new HashSet<>();
        for (char c : charArray) {
            if (c >= 'a' && c <= 'z') {
                mySet.add(c);

            }
        }
        return mySet.size();

    }
}
//regex101 oldalt megnézni,
