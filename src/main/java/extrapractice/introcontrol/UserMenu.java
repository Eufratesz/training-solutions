package extrapractice.introcontrol;

import java.util.Scanner;

public class UserMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Felhasználók listája");
        System.out.println("2. Felhasználó felvétele");
        System.out.println("Többi: Kilépés");

        System.out.println("Adjon meg egy számot!");
        int number = scanner.nextInt();
        scanner.hasNextLine();
        if(number == 1){
            System.out.println("Felhasználók listája");
        }
        if(number == 2){
            System.out.println("Felhasználók felvétele");
        }else{
            System.out.println("");
        }
    }
}
