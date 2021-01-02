package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ObjectsMain {

    public static void main(String[] args) {

   //     Book book = new Book();
  //      System.out.println(new Book());  // Exception in thread "main" java.lang.StackOverflowError

        //Book emtybook;    hiba.

  //      Book emptyBook = null;
 //       System.out.println(emptyBook);  //Exception in thread "main" java.lang.StackOverflowError

  //      System.out.println(emptyBook == null);

   //   book = new Book();
      //  System.out.println(book);           //Exception in thread "main" java.lang.StackOverflowError
   //     book = null;
       //  System.out.println(book);               //Exception in thread "main" java.lang.StackOverflowError

        Book book = new Book();
        Book anotherBook = new Book();

        System.out.println(book == anotherBook);

       // anotherBook == book;

        System.out.println(anotherBook);
        System.out.println(book == anotherBook);

        System.out.println(anotherBook instanceof Book);

        Book[] books = {new Book(), new Book(),new Book()};
        List<Book> books1 = Arrays.asList(new Book(),new Book());

        List<Book>books2 = new ArrayList<>();
        books2.add(new Book());
        books2.add(new Book());
        books2.add(new Book());




    }
}
