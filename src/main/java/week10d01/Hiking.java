package week10d01;

/*
Túrázás közben egy GPS eszköz rögzíti a pontokat. Eltárolja a GPS koordinátákat, valamint a magasságot
(mindegyik lebegőpontos érték).
Írj a week10d01.Hiking osztályba egy getPlusElevation() metódust, mely megkapja a magasságok listáját,
és visszaadja a emelkedések összegét. Azaz pl. 10,20,15,18 esetén 13, ugyanis (20 - 10) + (18 - 15).
A 20 méterről 15 méterre ereszkedést nem számolja bele,
hiszen az ereszkedés, és nem emelkedés. (edited)

 */

import java.util.ArrayList;
import java.util.List;

public class Hiking {

    private double gpsCoordinateX;
    private double getGpsCoordinateY;
    private List<Double> heightList;

    public double getPlusElevation(List<Double>heightList) {
        if (heightList == null) {
            throw new IllegalStateException("Üres a lista");
        }
        double result = 0;
        for(int i =1; i < heightList.size(); i++) {
            if(heightList.get(i)> heightList.get(i-1)) {
                result += heightList.get(i) - heightList.get(i-1);
            }
        }
        return result;

    }

}
