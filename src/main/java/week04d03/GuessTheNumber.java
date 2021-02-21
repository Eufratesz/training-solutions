package week04d03;

import java.util.Random;
import java.util.Scanner;

/*
Véletlenszám: 1-100 között. Gondol egy számot (pl 53) Kér egy számot, betippeled (pl. 23) - nagyobb. következő
tipp(pl 88). kisebb. Addig megy, míg ki nem találod a számot. "Ügyes vagy".
Bónusz: csak 6-ot lehet tippelni. "nem sikerült".
 */
public class GuessTheNumber {


    Random random = new Random();
    int randomNumberTo100 = random.nextInt(100) + 1;

    public void guess(int numberToFindOut) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gondoltam egy számot 1-100, találd ki.");

        int guessedNumber = 0;
        int numberOfGuesses=0;
        while (guessedNumber != numberToFindOut && numberOfGuesses < 6) {
            guessedNumber= scanner.nextInt();   //vagy egy lépésben: guessedNumber = Integer.parseInt(scanner.nextLine();
            scanner.nextLine();
            numberOfGuesses ++;
            System.out.println(numberOfGuesses + ". tipped volt.");
            if (guessedNumber < 0 || guessedNumber > 100) {
                throw new IllegalArgumentException("A szám 1 és 100 között legyen!");
            }
            if (guessedNumber > numberToFindOut) {
                System.out.println("A szám, amire gondoltam, ennél kisebb.");

            }
            if (guessedNumber < numberToFindOut) {
                System.out.println("A szám, amire gondoltam, ennél nagyobb");

            }
            if (guessedNumber == numberToFindOut) {
                System.out.println("Eltaláltad a számot!");
            }
        }
        if(guessedNumber != numberToFindOut) {
            System.out.println("Nem találtad el!");
        }
    }




public static void main(String[]args){
        GuessTheNumber guessTheNumber=new GuessTheNumber();

        guessTheNumber.guess(53);


        }
        }
