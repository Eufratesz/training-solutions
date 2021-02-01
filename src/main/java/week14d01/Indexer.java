package week14d01;

import java.util.*;

/*
Készíts egy Indexer osztályt, melynek van egy public Map<Character, List<String>> index(List<String> names) metódusa.
A feladat az, hogy egy indexet készítsünk a megadott nevek kezdőbetűiből (minden kezdőbetűt társítsunk az összes névvel,
 mely ezzel a betűvel kezdődik).
Példa:
System.out.println(new Indexer().index(Arrays.asList("Odon", "Lujza", "Abraham", "Magdolna")));
// {A=[Abraham], L=[Lujza], M=[Magdolna], O=[Odon]}
 */
public class Indexer {

    private String name;
    private char firstLetter;

    public String getName() {
        return name;
    }


    public Map<Character, List<String>> index(List<String> names) {

        Map<Character, List<String>>result = new HashMap<>();
        for (String name : names) {
            char firstLetter = name.charAt(0);
            if (!result.containsKey(firstLetter)) {

                result.put(firstLetter, new ArrayList<>());
            }
            result.get(firstLetter).add(name);
        }
        return result;
    }
}
