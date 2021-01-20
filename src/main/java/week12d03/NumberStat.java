/*
Készítsd el a week12d03.NumberStat osztályt melyben legyen egy metódus, ami paraméterül vár egy egész számokból álló
listát. Add vissza azt a számot amelyik pontosan egyszer szerepel a listában. Ha több ilyen szám van akkor a kisebbet!
Ellenőrizd, hogy olyan listát fogadunk el, ami legalább 1 elemű, ha a lista nem ilyen, dobj kivételt!
pl: {1,1,5,3,4,5,6,5,6,4,1,6,5,4} A megoldás: 3
Bónusz: Módosítsd az osztályt. Legyen egy egész számokból álló lista attribútuma. A fent megírt metódus ezen a
listán dolgozzon. A lista elemeit fájlból töltsük fel. A file úgy néz ki, hogy egy sorban három szám van vesszővel
elválasztva. Tehát:
1,1,4
2,3,5
2,2,5
 */


package week12d03;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class NumberStat {

    private List<Integer>numbers;

    public int numberStat(List<Integer>numbers) {

        Path file = Path.of("numberstat.txt");
        try (BufferedReader br = Files.newBufferedReader(file)) {

            if (numbers.size() < 1) throw new IllegalArgumentException("Empty list");

            List<Integer> stat = null;
            for (int number : numbers) {
                if (!numbers.contains(number)) {
                    stat.add(number);
                    Collections.sort(stat);
                    throw new NullPointerException("Empty list");
                }
                return stat.get(0);
            }

        } catch (IOException e) {
            new IllegalStateException("Can't read file", e);
        }
    }
}


