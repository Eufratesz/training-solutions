package training.trainerapp;

import java.util.Scanner;

public class Regisztracio {
    public static void main(String[] args) {
        System.out.println("Hello! Your name? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("E-mail address? ");
        String eMail = scanner.nextLine();

        System.out.println("Your registration data: " + name + " ; " + eMail);
        System.out.println("Viszlát!");
    }
}
