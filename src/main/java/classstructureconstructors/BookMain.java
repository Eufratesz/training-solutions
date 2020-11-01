package classstructureconstructors;

import java.util.Scanner;

public class BookMain {
    public void main(String[] args) {
        Book book = new Book("Charles Dickens", "A Christmas Carol");

        System.out.println("What is the registration number?");
        Scanner scanner = new Scanner(System.in);
        String regNumber = scanner.nextLine();
        System.out.println("Registration number: " + regNumber);
/*
        System.out.println(book.register());
        Itt nem tudok továbblépni.
 */
        System.out.println("The book is now registered.");

    }

}

/*
 System.out.println(book.register());
 */