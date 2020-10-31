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


/*
A main metódusban kérd be a felhasználótól a nevét és az email címét, majd írd ki, hogy milyen adatokkal regisztrált!
 */