package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderedArrayLibraryTest {

    private List<Book> bookList = new ArrayList<>();


    @BeforeEach
    public void setUp() throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("src/main/resources/books.csv");
        String line;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"))) {
            while(( line = reader.readLine()) != null) {
                String[]lineParts = line.split(";");
                bookList.add(new Book(Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2]));

            }
        }catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file");
        }
    }

    @Test
    void TestSortingById() {
        //Given
        Collections.shuffle(bookList);
        Book[]bookArray = new Book[bookList.size()];
        OrderedArrayLibrary orderedArrayLibrary = new OrderedArrayLibrary(bookList.toArray(bookArray));
        //When
        Book[]orderedBooks= orderedArrayLibrary.sortingById();
        //Then
        assertEquals(1001, orderedBooks[0].getTitle());
        assertEquals(1163, orderedBooks[orderedBooks.length-2].getId());
    }

    @Test
    void TestSortingByTitle() {
        //Given
        Collections.shuffle(bookList);
        Book[]bookArray = new Book[bookList.size()];
        OrderedArrayLibrary orderedArrayLibrary = new OrderedArrayLibrary(bookList.toArray(bookArray));
        //When
        Book[]orderedBooks = orderedArrayLibrary.sortingByTitle();
        //Then
        assertEquals("A babó", orderedBooks[0].getTitle());
        assertEquals("Tolkien", orderedBooks[0].getAuthor());
        assertEquals("1082 Tolkien A babó", orderedBooks[0].toString());
    }
}