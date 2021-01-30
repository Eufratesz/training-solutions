package collectionsequalshash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void testToString() {
        Book book = new Book("1223345", "Agatha Christie", "And there were none");
        System.out.println(book);
       assertEquals("Book{regNumber='1223345', author='Agatha Christie', title='And there were none'}", book.toString());


    }

}