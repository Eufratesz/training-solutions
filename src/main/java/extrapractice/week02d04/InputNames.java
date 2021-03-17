package extrapractice.week02d04;
/*
Hozz létre egy InputNames Java osztályt, melynek van egy main metódusa. Ciklusban kérj be öt nevet!
A neveket tárold el egy tömbben! Írd ki a tömb tartalmát, sortöréssel elválasztva (írd bele, hogy hanyadik
elem - 1-től sorszámozva)!
 */


import java.util.Scanner;

public class InputNames {

    public static void main(String[] args) {

        String[] names = new String[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("name?");
            names[i] = scanner.nextLine();
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(i+1 + ".name " + names[i] + " ");
        }
    }


}






