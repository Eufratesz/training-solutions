package classstructureattributes;

import java.util.Scanner;

public class ClientMain {

    public static void main(String[] args) {
        Client client = new Client();
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("What is your address?");
        String address = scanner.nextLine();

        System.out.println("When were you born (year)?");
        int year = scanner.nextInt();

        System.out.println("Check your your data please:");
        System.out.println("Your name: " + name);
        System.out.println("Your address: " + address);
        System.out.println("Your year of birth: " + year);
    }
}

/*
Amikor a születési év a 2. adat, akkor elakad a program, kéri, hogy töréspontot tegyek be (breakpoint),
amit nem tudtam, ezért cseréltem meg az adatok sorrendjét.
 */


/*
Hozz létre egy main() metódust a ClientMain osztályba,
amelyben kipróbálod a Client osztály működését.
Példányosítani kell egy objektumot a Client osztály alapján,
 majd kérd be az attribútumok értékét a felhasználótól.
Ellenőrzésképp írd ki minden attribútumának értékét a konzolra!
 */