/*
Készíts egy WordFilter osztályt, melyben van egy List<String> wordsWithChar(List<String> words, char c) metódus.
A metódus kiválógatja a paraméterül kapott String listából azokat a szavakat, melyekben előfordul a c karakter,
majd ezeket visszaadja egy listában.
 */

package week11d03;

import java.util.ArrayList;
import java.util.List;

public class WordFilter {

    public List<String> wordsWithChar(List<String> words, char c) {
        List<String> newList = new ArrayList<>();
        for (String word : words) {

            if (word.indexOf(c) >= 0) {
                newList.add(word);
            }
        }
        return newList;
    }
    /*
    private boolean isInWord(String word, char c){
        for( int i =0; i< word.length(); i++) {
            if (word.charAt(i) ==c) {
                return true;
            }
        }
        return false;
    }

     */
}

