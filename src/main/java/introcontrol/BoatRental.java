package introcontrol;

import java.util.Scanner;
// Ezt nem tudtam egyedül megoldani, de már értem:)
public class BoatRental {
    public static void main(String[] args) {

        int boat1Seats = 5;
        int boat2Seats = 3;
        int boat3Seats = 2;

        System.out.println("Hányan vannak?");
        Scanner scanner = new Scanner(System.in);
        int numberOfPeople = scanner.nextInt();

        int freePlaces = 10;
        int freeBoats = 3;

        if (numberOfPeople > 3){
            System.out.println("Öt személyes csónak.");
            numberOfPeople = numberOfPeople - 5;
            freeBoats--;
            freePlaces = freePlaces -5;
        }

        if (numberOfPeople > 2) {
            System.out.println("Három személyes csónak.");
            numberOfPeople = numberOfPeople - 3;
            freeBoats--;
            freePlaces = freePlaces - 3;
        }

        if (numberOfPeople > 0)  {
            System.out.println("Két személyes csónak.");
            numberOfPeople = numberOfPeople -2;
            freeBoats--;
            freePlaces = freePlaces - 2;
        }

        if (numberOfPeople > 0) {
            System.out.println("Nem fért be mindenki.");
        } else {
            System.out.println("Üres helyek száma: " + freePlaces);
            System.out.println("Üres csónakok száma: " + freeBoats);
        }
    }
}
