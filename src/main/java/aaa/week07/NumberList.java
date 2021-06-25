package aaa.week07;

/*
Hozz létre egy NumberList osztályt! Ennek legyen egy metódusa isIncreasing(List<Integer>), mely egy számokból álló
listát vár paraméterül és megnézi, hogy a listában a számok növekvő sorrendben szerepelnek-e és ennek megfelelően
igaz vagy hamis értékkel tér vissza! Speciális eset ha két egymást követő szám egyenlő, ez nem probléma a
 1, 2, 3, 3, 3, 5 számokat növekvőnek tekintjük.
 */

import java.util.List;

public class NumberList {

    public boolean isIncreasing(List<Integer> numbers) {
        for (int i = 0; i < numbers.size()-1; i++) {
            if (numbers.get(i) > numbers.get(i+1)) {
                return false;
            }
        }
        return true;
    }
}
