package aaa.week10;

import java.util.List;

/*
Túrázás közben egy GPS eszköz rögzíti a pontokat. Eltárolja a GPS koordinátákat, valamint a magasságot (mindegyik
lebegőpontos érték). Írj a week10d01.Hiking osztályba egy getPlusElevation() metódust, mely megkapja a magasságok
listáját, és visszaadja a emelkedések összegét. Azaz pl. 10,20,15,18 esetén 13, ugyanis (20 - 10) + (18 - 15).
A 20 méterről 15 méterre ereszkedést nem számolja bele, hiszen az ereszkedés, és nem emelkedés.
 */
public class Hiking {

    public double getPlusElevation(List<Double> heights) {
        double sum = 0.0;

        for (int i = 0; i < heights.size()-1; i++) {
            if(heights.get(i+1) > heights.get(i)){
                sum += heights.get(i+1)-heights.get(i);  //növelem a két érték különbségével.
            }
        }
        return sum;
    }

    public double getPlusElevation2(List<Double> heights){
        double sum = 0;
        for(int i = 1; i< heights.size(); i++){
            if(heights.get(i) > heights.get(i-1)){
                sum += heights.get(i) - heights.get(i-1);
            }
        }
        return sum;
    }
}
