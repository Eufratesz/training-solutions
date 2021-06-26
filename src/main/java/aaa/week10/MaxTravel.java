package aaa.week10;

/*
Van egy egész számok listája, amelyben egy szám azt jelzi, hogy az adott számú buszmegállóban egy ember fel akar szállni.
 A 12,12,0,3,4,4 sorozat tehát azt jelenti, hogy a 12-es buszmegállóban 2-en, a 0-ásban 1 ember, 3-asban egy ember,
 4-esben 2 ember akar felszállni. A MaxTravel osztály getMaxIndex() metódusa adja vissza, hogy hanyas megállóban
 szeretnének a legtöbben felszálln! Maximum 30 megálló lehet.
Leegyszerűsítve a feladat az, hogy a paraméterként átadott tömbben keresse meg, hogy melyik szám szerepel a legtöbbször.

 */


import java.util.List;

public class MaxTravel {


    public int getMaxIndex(List<Integer>numbers){
        int[ ]counters = new int[30];
        for(int i : numbers){
            counters[i]++;
        }

        int index = 0;
        for(int i = 0; i < counters.length; i++){
            if(counters[index] < counters[i]){
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        MaxTravel maxTravel = new MaxTravel();

        int max =maxTravel.getMaxIndex(List.of(12,12,0,3,4,4, 12));
        System.out.println(max);
    }
}
