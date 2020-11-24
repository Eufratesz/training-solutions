package statements;


import java.util.Scanner;

public class DivByThree {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Írjon be egy egész számot: ");
        int number = scanner.nextInt();

        System.out.print("A megadott szám ");

        System.out.println(number % 3 == 0 ? "osztható 3-mal" : "nem osztható 3-mal");

    }

}
