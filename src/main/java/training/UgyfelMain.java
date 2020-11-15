package training;

import java.util.Scanner;

public class UgyfelMain {
    public static void main(String[] args) {
        Ugyfel ugyfel = new Ugyfel();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Good morning!");
        System.out.println("What's your name?");
        ugyfel.name = scanner.nextLine();
        System.out.println("Year of birth?");
        ugyfel.year = scanner.nextInt();
        System.out.println("What's your address?");
        ugyfel.address = scanner.nextLine(); //be kell rakni egy nextLine-t, hogy kiírja a következő választ is.
        ugyfel.address = scanner.nextLine();


        System.out.println("Name: " + ugyfel.name);
        System.out.println("Year of birth: " + ugyfel.year);
        System.out.println("Address: " + ugyfel.address);
        System.out.println("Goodbye!");
    }
}
