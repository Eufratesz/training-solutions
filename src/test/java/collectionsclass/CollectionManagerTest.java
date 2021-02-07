package collectionsclass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CollectionManagerTest {

    private List<Book>bookList = new ArrayList<>();

    @BeforeEach
            public void setUp() throws IOException {
        InputStream is = this.getClass().getClassLoader().getResourceAsStream("books.csv");
        String line;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8))){
             while ((line = reader.readLine()) != null){
                 String[]lineParts = line.split(";");
                 bookList.add(new Book (Integer.parseInt(lineParts[0]), lineParts[1], lineParts[2]));
             }
        }catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file", ioe);
        }
    }

    @Test
    void unmodifiableListShouldThrowExceptionWhenAdd() throws UnsupportedOperationException{
        //Given
        CollectionManager collectionManager = new CollectionManager(bookList);
        //When
        assertThrows(UnsupportedOperationException.class,()-> {
            collectionManager.createUnmodifiableLibrary().add(new Book (1984, "Animal Farm", "George Orwell"));
        });
    }





    @Test
    void TestReverseLibrary() {
        //Given
        CollectionManager collectionManager= new CollectionManager(bookList);
        //When
        List<Book>bookList = collectionManager.reverseLibrary();
        //Then
        assertEquals(1172, bookList.get(0).getId());
        assertEquals(1001, bookList.get(bookList.size()-1).getId());
    }

    @Test
    void getFirstBook() {
        //Given
        CollectionManager collectionManager= new CollectionManager(bookList);
        //When
        Book firsbook = collectionManager.getFirstBook();
        //Then
        assertEquals(1001, firsbook.getId());
    }


    @Test
    void getLastBook() {
        //Given
        CollectionManager collectionManager= new CollectionManager(bookList);
        //When
        Book lastBook = collectionManager.getLastBook();
        //Then
        assertEquals(1172, lastBook.getId());
    }
}