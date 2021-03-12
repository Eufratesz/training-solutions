package extrapractice.introcontrol;

import java.util.Scanner;

public class Qualifier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adjon meg egy számot!");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number > 100){
            System.out.println("A szám nagyobb, mint 100");
        }else{
            System.out.println("A szám 100, vagy annál kisebb.");
        }
    }
}
