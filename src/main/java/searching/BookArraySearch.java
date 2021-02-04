package searching;

import java.util.Arrays;


public class BookArraySearch {

   private Book[] bookArray;

    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book findBookByAuthorTitle(String author, String title) {
        if(author.isEmpty() || title.isEmpty()){
            throw new IllegalArgumentException("Author or title must be given.");
        }
        Book book = new Book(author, title);
        Arrays.sort(bookArray);
        int index = Arrays.binarySearch(bookArray, book);
        if (index <0) {
            throw new IllegalArgumentException("No such book.");
        }
        return bookArray[index];


    }
}
