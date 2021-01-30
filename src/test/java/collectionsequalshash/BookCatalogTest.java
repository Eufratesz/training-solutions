package collectionsequalshash;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class BookCatalogTest {

    private static final Book[]books = new Book[] {
            new Book("123456", "George Orwell", "Animal Farm"),
            new Book ( "2345678", "George Orwell", "1984"),
            new Book ("987654", "Agatha Christie", "Halloween party")
    };

    @Test
    void findBookByTitleAuthor() {
        //When
        Book foundbook = new BookCatalog().findBookByTitleAuthor(Arrays.asList(books), "George Orwell", "1984");
        //Then
        assertEquals("2345678", foundbook.getRegNumber());
        assertEquals("George Orwell", foundbook.getAuthor());
        assertEquals("1984", foundbook.getTitle());
        assertEquals("Book{regNumber='2345678', author='George Orwell', title='1984'}" , foundbook.toString());

    }
    @Test
    void bookNotInList() {
        Book foundbook = new BookCatalog().findBookByTitleAuthor(Arrays.asList(books), "Arthur Conan Doyle", "Sherlock Holmes");
        assertNull(foundbook);
    }

    @Test
    void findBookInSearchableBookList() {
        //Given
        Book searchingFor = new Book("987654", "Agatha Christie", "Halloween party");
        //When
        Book foundBook = new BookCatalog().findBook(Arrays.asList(books), searchingFor);
        //Then
        assertTrue(searchingFor.equals(foundBook));

    }

    @Test
    void bookNotInBookList() {
        //Given
        Book searchingFor = new Book("9876", "Agatha Christy", "Halloween parties");
        //When
        Book foundBook = new BookCatalog().findBook(Arrays.asList(books), searchingFor);
        //Then
        assertNull(foundBook);
    }

    @Test
    void findBookByTitleAndAuthor(){
        //Given
        Book searchingFor = new Book("George Orwell", "1984");
        //When
        Book foundbook = new BookCatalog().findBook(Arrays.asList(books), searchingFor);
        //Then
        assertTrue(searchingFor.equals(foundbook));

    }

    @Test
    void addSameBooksToSet(){
        //Given
        Book[]sameBooks = new Book[]{
                new Book("384589", "P.Howard", "Piszkos Fred, a kapitány"),
                new Book("384589", "P.Howard", "Piszkos Fred, a kapitány"),
                new Book("384589", "P.Howard", "Piszkos Fred, a kapitány")
        };
        //When

        Set<Book>setOfBooks = new BookCatalog().addBooksToSet(sameBooks);
        assertEquals(1,setOfBooks.size());
    }
}