package extrapractice.finalmodifier;

import java.util.Arrays;
import java.util.List;

public class Week {

    public static final List<String> DAYS_OF_THE_WEEK = Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");

    public static void main(String[] args) {
        DAYS_OF_THE_WEEK.set(1,"szerda");
        System.out.println(DAYS_OF_THE_WEEK);
    }


}
