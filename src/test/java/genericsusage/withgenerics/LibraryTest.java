package genericsusage.withgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library library = new Library();

    @Test
    public void bookShouldBeCreated(){
        Book book = new Book("War and peace");
        assertEquals("War and peace", book.getTitle());
    }
//Saját megoldás:
    @Test
    public void getFirstBookWithGenerics(){
        List<String> books = new ArrayList<>();
        books.add("War and peace");
        books.add("1984");
        books.add("Bambi");

        String firstBook= books.get(0);
        assertEquals(firstBook, "War and peace");

     }

     //Megoldókulcsban:
    /*
    @Test
    public void shouldReturnFirst() {
    assertEquals("Egri csillagok", new Library().getFirstBook(Arrays.asList(new Book("Egri csillagok"))).getTitle());
     */

     @Test
    public void methodShouldThrowNullPointerException() {

         assertThrows(NullPointerException.class, () -> new Library().getFirstBook(null));
     }

         @Test
         public void methodShouldThrowIllegalArgumentException(){
         List<Book>emptyList = new ArrayList<>();
             Exception ex = assertThrows(IllegalArgumentException.class, ()-> new Library().getFirstBook(emptyList));
         assertEquals("The list is empty", ex.getMessage());

     }

}