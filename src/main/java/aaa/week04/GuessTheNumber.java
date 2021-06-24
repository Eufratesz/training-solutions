package aaa.week04;

/*
Írj egy számkitaláló programot a GuessTheNumber osztályba! A program kitalál egy véletlenszerű számot 1 és 100 között.
Majd bekér a felhasználótól ciklusban számokat. Mindig megmondja, hogy a szám, kisebb, nagyobb vagy egyenlő-e mint a
gondolt szám.
Bónusz feladat: max 6-szor lehet kérdezni!

 */

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;

        int guess = 0;
        int numberOfGuesses = 0;
        while (guess != randomNumber && numberOfGuesses < 6) {
            System.out.println("Írj be egy számot!");
            guess = Integer.parseInt(scanner.nextLine());
            numberOfGuesses++;
            System.out.println(numberOfGuesses + ". tipp volt.");
            if (guess < randomNumber) {
                System.out.println("A gondolt szám nagyobb.");
            }
            if (guess > randomNumber) {
                System.out.println("Kisebb számra gondoltam");
            }
            if (guess == randomNumber) {
                System.out.println("Eltaláltad!");
            }
        }
        if (guess != randomNumber) {
            System.out.println("Nem találtad el!");
        }
    }
}
