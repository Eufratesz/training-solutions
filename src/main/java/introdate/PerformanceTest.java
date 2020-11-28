package introdate;

import java.time.LocalDate;
import java.time.LocalTime;

public class PerformanceTest {

    public static void main(String[] args) {
        Performance performance = new Performance("Gálvölgyi János", LocalDate.of(2020,11,30), LocalTime.of(21,00), LocalTime.of(23,00) );


        System.out.println(performance.getArtist());
        System.out.println(performance.getDate());
        System.out.println(performance.getStartTime());
        System.out.println(performance.getEndTime());


        System.out.println(performance.getInfo());
    }
}
