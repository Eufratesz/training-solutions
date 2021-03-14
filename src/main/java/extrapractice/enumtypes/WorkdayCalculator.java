package extrapractice.enumtypes;

import java.util.ArrayList;
import java.util.List;

public class WorkdayCalculator {

    public List<DayType> dayTypes(Day firstDay, int numberOfDays) {
        List<DayType> typeList = new ArrayList<>();
        Day d = firstDay;
        for(int i = 0; i< numberOfDays; i++){
           typeList.add(firstDay.getDayType());
            d = nextDay(d);
        }
        return typeList;

    }

    private Day nextDay(Day day) {
        if (day.ordinal() == Day.values().length - 1) {
            return Day.values()[0];
        } else {
            return Day.values()[day.ordinal() + 1];
        }
    }
}
