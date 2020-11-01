package classstructureio;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        System.out.println("What is your full name?");
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine();

        System.out.println("What is your e-mail address?");
        String eMailAddress = scanner.nextLine();

        System.out.println("Hello " + name + "! You are now registered.");
        System.out.println("Your e-mail address: " + eMailAddress);

    }
}

