package extrapractice.statements;

import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Írjon be egy számot!");
        int number = scanner.nextInt();
        scanner.nextLine();

//        if (number % 3 == 0) {
//            System.out.println("A megadott szám, " + number + " osztható hárommal.");
//        } else {
//            System.out.println("A megadott szám, " + number + " nem osztható hárommal.");
//        }

        System.out.println(number % 3 == 0 ? "osztható 3-mal" : "nem osztható 3-mal");
    }
}
