package collectionscomp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OrderedLibraryTest {


    private OrderedLibrary library;

    @BeforeEach
            void setUp() {
        List<Book> libraryBooks = new LinkedList<>(Arrays.asList(
                new Book("1984", "George Orwell", 12345),
                new Book("Animal Farm", "George Orwell", 12346),
                new Book("And there were none", "Agatha Christie", 12347),
                new Book("Ábel a rengetegben", "Tamási Áron", 12348)
        ));

        library = new OrderedLibrary(libraryBooks);
    }


    @Test
    void orderedByTite() {
        //Given
        List<Book>orderedListByTitle = library.orderedByTite();
        //Then
        assertEquals("And there were none", orderedListByTitle.get(1).getTitle());
        assertEquals("George Orwell", orderedListByTitle.get(2).getAuthor());
    }

    @Test
    void orderedByAuthor() {
        //Given
        List<Book>orderedListByAuthor = library.orderedByAuthor();
        //Then
        assertEquals("Agatha Christie", orderedListByAuthor.get(0).getAuthor());
    }

    @Test
    void orderedByTitleLocale() {
        //Given
        List<String>orderedByTitleHun = library.orderedByTitleLocale(new Locale("hu", "HU"));
        //Then
        assertEquals("Ábel a rengetegben", orderedByTitleHun.get(1));
        assertEquals("1984", orderedByTitleHun.get(0));
        assertEquals("And there were none", orderedByTitleHun.get(2));
    }
}