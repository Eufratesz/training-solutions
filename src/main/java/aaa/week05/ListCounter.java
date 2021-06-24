package aaa.week05;

/*
Írj egy olyan metódust a ListCounter osztályban, mely a kapott String listából összeszámolja azokat, amelyek a vagy A
betűvel kezdődnek! Ha nulla elemű a tömb, vagy nincs benne ilyen elem, akkor nulla értéket adjon vissza!
 */

import java.util.Arrays;
import java.util.List;

public class ListCounter {


    public int countWordsStartsWithA(List<String> words) {

        int count = 0;

        for (String item : words) {
            item = item.toLowerCase();
            if (item.startsWith("a")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ListCounter listCounter = new ListCounter();
        int count = listCounter.countWordsStartsWithA(Arrays.asList("alma", "barack", "szilva", "Asztal", "Anna"));
        System.out.println(count);

    }
}
