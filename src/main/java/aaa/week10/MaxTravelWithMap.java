package aaa.week10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxTravelWithMap {

    public Map<Integer, Integer> getPassengersPerBusSop(List<Integer> numbers) {
        Map<Integer, Integer> numberOfBusStop = new HashMap<>();

        for (int busStop : numbers) {
            if (numberOfBusStop.containsKey(busStop)) {
                numberOfBusStop.put(busStop, numberOfBusStop.get(busStop) + 1);
            } else {
                numberOfBusStop.put(busStop, 1);
            }
        }
        System.out.println(numberOfBusStop);

        return numberOfBusStop;
    }

    public static void main(String[] args) {
        MaxTravelWithMap mt = new MaxTravelWithMap();
        mt.getPassengersPerBusSop(List.of(12, 12, 0, 3, 4, 4));
    }
}

