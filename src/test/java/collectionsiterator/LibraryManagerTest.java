package collectionsiterator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LibraryManagerTest {

   private LibraryManager manager;

    @BeforeEach
    public void bookSetShoudBeCreated(){
        Set<Book>libraryBooks = new HashSet<>(Arrays.asList(new Book("Animal Farm", "George Orwell", 12345),
                new Book("And there were none", "Agatha Christie", 67890),
                new Book("1984", "George Orwell", 28374)));
        manager = new LibraryManager(libraryBooks);

    }

    @Test
    void missingRegnumberShouldThrowException()throws MissingBookException{
        Exception ex = assertThrows(MissingBookException.class, ()->{
            manager.findBookByRegnumber(12346);
        });
        assertEquals("No books found with regnumber: 12346", ex.getMessage());
    }

    @Test
    void TestFindBookByRegNumber(){
        //When
        Book book = manager.findBookByRegnumber(67890);
        //Then
        assertEquals("And there were none", book.getTitle());
        assertEquals("Agatha Christie", book.getAuthor());
    }

    @Test
    void noRegNumberAtRemoveShouldThrowException() throws MissingBookException {
        Exception ex = assertThrows(MissingBookException.class,()-> {
            manager.removeBookByRegnumber(67891);
        });
        assertEquals("No books found with regnumber: 67891", ex.getMessage());
    }

    @Test
     void testRemoveByRegnumber(){
        //When
        int foundBook = manager.removeBookByRegnumber(67890);
        //Then
        assertEquals(67890, foundBook);
        assertEquals(2, manager.libraryBooksount());
    }

    @Test
    void noSuchAuthorShouldThrowException() throws MissingBookException{
        Exception ex = assertThrows(MissingBookException.class,()->{
            manager.selectBooksByAuthor("Benedek Elek");
        });
        assertEquals("No books found written by: Benedek Elek", ex.getMessage());
    }

    @Test
    void testSelectBooksByAuthor() {
        //When
        Set<Book>foundBooks = manager.selectBooksByAuthor("George Orwell");
        //Then
        assertEquals(2, foundBooks.size());
    }

}