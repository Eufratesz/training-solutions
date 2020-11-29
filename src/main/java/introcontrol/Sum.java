package introcontrol;

import java.util.Scanner;

public class Sum {

    /*
    Eredeti megoldásom
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. szám:");
        int firstNumber = scanner.nextInt();
        System.out.print("2. szám:");
        int secondNumber = scanner.nextInt();
        System.out.print("3. szám:");
        int thirdNumber = scanner.nextInt();
        System.out.print("4. szám:");
        int fourthNumber = scanner.nextInt();
        System.out.print("5. szám:");
        int fifthNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber;
        System.out.println("A megadott öt szám összege: " + sum);
    }

     */

    //Kipróbálom a megoldókulcs alapján, ciklussal:
    public static void main(String[] args) {
        System.out.println("Adjon meg öt számot!");
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Add meg a(z) " + (i + 1) + ". számot!");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Az összeg: " + sum);
    }
}
