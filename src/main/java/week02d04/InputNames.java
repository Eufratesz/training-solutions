package week02d04;
/*
main metódus
Ciklusban bekérni 5 nevet
neveket eltárolni egy tömbben
kiírni a tömb tartalmát.
 */

import java.util.Scanner;

public class InputNames {
/* Elrontottam, mert nem ciklusban kértem be az adatokat.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name? ");
        String name1 = scanner.nextLine();
        System.out.println("Second name? ");
        String name2 =scanner.nextLine();
        System.out.println("Third name?");
        String name3 =scanner.nextLine();
        System.out.println("Fourth name?");
        String name4 =scanner.nextLine();
        System.out.println("Fifth name?");
        String name5 =scanner.nextLine();

        String[]names = new String[]{name1, name2, name3, name4, name5};

        for(String name: names){
            System.out.println(name);
        }
    }

 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arrayOfNames = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Name: ");
            arrayOfNames[i] = scanner.nextLine();
        }
        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(i + ". name: " + arrayOfNames[i] + " ");  //akkor érdemes, ha kell az index is.
        }

        /*István kiegészítése: inkább for-each ciklussal járjuk be a tömbot / listát:

        for (String name : arrayOfNames) {
            System.out.print(name + " ");
        }
         */
    }
}

