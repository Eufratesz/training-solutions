package training;

import java.util.Scanner;

public class Szamologep {
    public static void main(String[] args) {
        System.out.println("Írjon be egy egész számot!");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Az első szám: " + number);

        System.out.println("Írjon be egy másik egész számot!");
        int anotherNumber = scanner.nextInt();
        System.out.println("A második szám: " + anotherNumber);

        System.out.println("A két számot összeadjuk: " + number + "+ " + anotherNumber);
        int result = number + anotherNumber;
        System.out.println("Az összeg: " + result);
        System.out.println("Viszlát!");
    }
}
