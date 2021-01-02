package finalmodifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Week {
/*
Eredeti megoldásom, működik így is, bár hosszabb és nincs final benne.)
    public static void main(String[] args) {

        List<String> daysOfTheWeek = new ArrayList<>();
        daysOfTheWeek.add("hétfő");
        daysOfTheWeek.add("kedd");
        daysOfTheWeek.add("szerda");
        daysOfTheWeek.add("csütörtök");
        daysOfTheWeek.add("péntek");
        daysOfTheWeek.add("szombat");
        daysOfTheWeek.add("vasárnap");

        Week week = new Week();
        System.out.println(Arrays.asList(daysOfTheWeek));

       */

    public static final List<String>DAYS = Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");

    public static void main(String[] args) {
        DAYS.set(1, "szerda");
        System.out.println(DAYS);
    }


    }

