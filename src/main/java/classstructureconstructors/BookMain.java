package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Charles Dickens", "A Christmas Carol");

        System.out.println("What is the registration number?");

        Scanner scanner = new Scanner (System.in);
        String regNumber = scanner.nextLine();


        System.out.println(book.getAuthor());
        System.out.println(book.getTitle());
        System.out.println(regNumber);

      /*  System.out.println(book.getRegNumber(regNumber));
Így nem akart működni.

*/

        System.out.println("The book is registered now.");
    }
}
