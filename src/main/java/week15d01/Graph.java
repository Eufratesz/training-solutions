package week15d01;
/*
Adott egy függvénygrafikon a koordináta rendszerben. A grafikon néhány pontját megkapjuk egy Map-ben.
 A map kulcsa az x koordináta értéke pedig az y koordináta. Döntsük el,
hogy a kapott pontok küzül, hol van a függvénynek maximum helye és ott mennyi az értéke.
 */

import java.util.Map;

public class Graph {


    public Map.Entry<Double, Double> maxValueEntry(Map<Double, Double> graphOfFunction) {
        if(graphOfFunction.isEmpty() || graphOfFunction.containsValue(Double.MIN_VALUE)){
            throw new IllegalArgumentException("Wrong parameter!");
        }
        Map.Entry<Double, Double> maxElement =  null;
        double maxValue = Double.MIN_VALUE;

        for(Map.Entry<Double, Double> actual : graphOfFunction.entrySet()){
            if(maxValue < actual.getValue()) {
                maxElement = actual;
                maxValue = actual.getValue();
            }
        }
        return maxElement;

    }




















}
