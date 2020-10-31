package classstructureio;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Write a whole number, please!");
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();

        System.out.println("Write another whole number, please!");
        int secondNumber = scanner.nextInt();

        System.out.println("Let's do the addition!");
        System.out.println(firstNumber + " + " +  secondNumber);
        int totalAmount = firstNumber + secondNumber;

        System.out.println("The total amount is: " + totalAmount);

        /*
        Másik megoldás az utolsó 2 sor helyett:
        System.out.println("The total amount is: ");
        System.out.println(firstNumber + secondNumber);
*/



    }
}
