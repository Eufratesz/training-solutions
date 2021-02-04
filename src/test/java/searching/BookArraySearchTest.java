package searching;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookArraySearchTest {

    private List<Book> bookList = new ArrayList<>();

    @BeforeEach //Ezt még át kell ismételni.
    public void setUp() throws IOException{
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("books.csv");
        String line;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"))){
            while((line = reader.readLine()) != null) {
                String[] lineParts = line.split(";");
                bookList.add(new Book(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2]));
            }
        }catch (IOException ioe){
            throw new IllegalArgumentException("Cannot find file", ioe);
        }

    }
/*
    @Test
    void noAuthorOrTitleShouldThrowException() throws IllegalArgumentException {
        Book[] bookArray = new Book[bookList.size()];

        Exception ex = assertThrows(IllegalArgumentException.class, () ->
                new BookArraySearch(bookList.toArray(bookArray)).findBookByAuthorTitle(" ", " "));
        assertEquals("Author or title must be given.", ex.getMessage());
    }

 */
/*
    @Test
    void emtpyParamShouldThrowException() throws IllegalArgumentException {

        Book[] bookArray = new Book[bookList.size()];

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new BookArraySearch(bookList.toArray(bookArray)).findBookByAuthorTitle(null, null);
        });
        assertEquals("Author or title must be given.", ex.getMessage());
    }

 */

    @Test
    void bookNotFoundShouldThrowException() throws IllegalArgumentException {
        String author = "Tamási Áron";
        String title = "Ábel a rengetegben";
        Book[] bookArray = new Book[bookList.size()];

        Exception ex = assertThrows(IllegalArgumentException.class, () -> {
            new BookArraySearch(bookList.toArray(bookArray)).findBookByAuthorTitle(author, title);
        });
        assertEquals("No such book.", ex.getMessage());
    }


    @Test

    void testFindBookByAuthorAndTitle() {
        //Given
        Book[]bookArray = new Book[bookList.size()];
        BookArraySearch bookArraySearch = new BookArraySearch(bookList.toArray(bookArray));

        //When
        Book book = bookArraySearch.findBookByAuthorTitle("George Orwell", "1984");
        //Then
        assertEquals(1163, book.getId());
    }
}






