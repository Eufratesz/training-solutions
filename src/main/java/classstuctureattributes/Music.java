package classstuctureattributes;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Song song = new Song();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Who's your favourite singer?");
        song.band = scanner.nextLine();
        System.out.println("What's the title of your favourite song?");
        song.title = scanner.nextLine();
        System.out.println("How long is your favourite song (minutes)");
        song.length = scanner.nextInt();
        System.out.println();

        System.out.println("Your favourite song:");
        System.out.println(song.band + " -  " + song.title + " (" + song.length + " minutes). ");
    }
}
