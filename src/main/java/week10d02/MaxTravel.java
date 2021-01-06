package week10d02;

import java.util.ArrayList;
import java.util.List;

/*
Van egy egész számok listája, amelyben egy szám azt jelzi, hogy az adott számú buszmegállóban egy ember fel akar
szállni. A 12,12,0,3,4,4 sorozat tehát azt jelenti, hogy a 12-es buszmegállóban 2-en, a 0-ásban 1 ember, 3-asban
egy ember, 4-esben 2 ember akar felszállni. A MaxTravel osztály getMaxIndex() metódusa adja vissza, hogy hanyas
megállóban szeretnének a legtöbben felszállni. Maximum 30 megálló lehet.
 */
public class MaxTravel {



    public int getMaxIndex(List<Integer>passengers) {
       int[]passengersSum = new int[30];
       int maxIndex = 0;
       int maxValue = 0;

       for(int i = 0; i< passengers.size(); i++) {
           passengersSum[passengers.get(i)]++;
      }
       for(int item : passengers) {
           passengersSum[item] ++;
       }
       for(int i =0; i < passengersSum.length; i++) {
           if(passengersSum[i] > maxValue) {
               maxValue = passengersSum[i];
               maxIndex =i;
           }
       }
       return maxIndex;


    }


}
