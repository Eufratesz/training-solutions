package statements;

import java.util.Scanner;

public class TimeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Írja be az első időpontot!");
        System.out.print("óra: ");
        int hour = scanner.nextInt();
        System.out.print("perc: ");
        int minute = scanner.nextInt();
        System.out.print("másodperc: ");
        int second = scanner.nextInt();

        System.out.println("Írja be a második időpontot!");
        System.out.print("óra: ");
        int anotherHour = scanner.nextInt();
        System.out.print("perc: ");
        int anotherMinute = scanner.nextInt();
        System.out.print("másodperc: ");
        int anotherSecond = scanner.nextInt();

        Time time = new Time(hour, minute, second);
        Time anotherTime = new Time(anotherHour, anotherMinute, anotherSecond);


        System.out.println("Az első időpont: " + time.toString() + "= " +time.getInMinutes() + " perc.");
        System.out.println("A második időpont: " + anotherTime.toString() + "= " + time.getInSeconds() + " másodperc.");
        System.out.println("Az első időpont korábbi, mint második: " + time.earlierThan(anotherTime));

    }
}

