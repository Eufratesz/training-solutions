package aaa.week03;

import java.util.Scanner;

public class ReadNumbersDemo {

    public int add(int i, int j) {
        if (i < 0) {
            throw new IllegalArgumentException("nem lehet negatív szám");
        }
        return i + j;
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String line = scanner.nextLine();
//        try {
//          int number = Integer.parseInt(line);
//            System.out.println(number);
//        } catch (NumberFormatException ne) {
//            System.out.println("Ez nem szám");
//        }

        ReadNumbersDemo numbersDemo = new ReadNumbersDemo();
        System.out.println(numbersDemo.add(5, 6));
        try {
            numbersDemo.add(-5, 6);
        } catch (IllegalArgumentException iae) {
            System.out.println("Az első paraméter negatív");
        }
    }
}
