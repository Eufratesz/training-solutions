package genericsusage.withgenerics;

import genericsusage.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    /*
    List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return new ArrayList<>();
    }

     */

    public Book getFirstBook(List<Book>books) {
        if(books == null) {
            throw new NullPointerException("No list");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }
        return (books.get(0));
    }
}
