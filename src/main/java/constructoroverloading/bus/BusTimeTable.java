package constructoroverloading.bus;

import java.util.ArrayList;
import java.util.List;

public class BusTimeTable {

    private List<SimpleTime> timeTable = new ArrayList<>();

    public BusTimeTable(List<SimpleTime> timeTable) {
        this.timeTable.addAll(timeTable);
    }

    public BusTimeTable(int firstHour, int lastHour, int everyMinute) {
        for (int i = firstHour; i <= lastHour; i++) {
            SimpleTime simpleTime = new SimpleTime(i, everyMinute);
            timeTable.add(simpleTime);
        }


    }

    public List<SimpleTime> getTimeTable() {
        return new ArrayList<>(timeTable);
    }

    public SimpleTime nextBus(SimpleTime actual){
        SimpleTime min = null;
        for(SimpleTime time : timeTable){
            if(actual.difference(time) < 0 && (min == null ||time.difference(min) <0) ) {
                min = time;

            }

        }
        if(min == null ){
            throw new IllegalStateException("No more buses today!");
        }
        return min;

    }


    public SimpleTime firstBus(){
        return nextBus(new SimpleTime(0));
    }
}
