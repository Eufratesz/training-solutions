package genericsusage.withoutgenerics;

import genericsusage.Book;

import java.util.List;

public class Library {
    public Book getFirstBook(List books) {
        if( books == null) {
            throw new NullPointerException("No list");
        }
        if (books.isEmpty()) {
            throw new IllegalArgumentException("The list is empty");
        }
        Object o = books.get(0);
        if(!(o instanceof Book)) {
            throw new ClassCastException("It is not a book");
        }

        return (Book) o;
    }
}
