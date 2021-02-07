package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class OrderedLibraryTest {

    private List<Book> bookList = new ArrayList<>();

    @BeforeEach
            public void setUp() throws IOException{
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("/training-solutions/books.csv");
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            while (( line = reader.readLine()) != null) {
                String[]lineParts = line.split(";");
                bookList.add(new Book(Integer.parseInt(lineParts[0]), lineParts[1], lineParts [2]));
            }
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    @Test
    public void emptySetShouldThrowExcdeption() throws NullPointerException {
        Exception ex = assertThrows(NullPointerException.class,()-> new OrderedLibrary(new TreeSet<>()).lendFirstBook());
        assertEquals("Library is empty", ex.getMessage());
           }




    @Test
    void lendFirstBook() {
        //Given
        Collections.shuffle(bookList);
        OrderedLibrary orderedLibrary = new OrderedLibrary(new TreeSet<>(bookList));
        //When
        Book book = orderedLibrary.lendFirstBook();
        //Then
        assertEquals(1001, book.getId());


    }
}