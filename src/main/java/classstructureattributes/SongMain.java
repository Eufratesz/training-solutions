package classstructureattributes;

import java.util.Scanner;

public class SongMain {
    public static class Music {
        public static void main(String[] args) {
            Song song = new Song();

            System.out.println("What is your favourite band?");
            Scanner scanner = new Scanner(System.in);
            String band = scanner.nextLine();

            System.out.println("What is your favourite song?");
            String title = scanner.nextLine();

            System.out.println("How long is your favourite song? (minutes)");
            int length = scanner.nextInt();

            System.out.println("Your favourite song: " + band + " - " + title + " (" + length + " minutes)");
        }
    }
}
