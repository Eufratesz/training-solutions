package genericsusage.withoutgenerics;

import genericsusage.Book;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class LibraryTest {

    @Test
    public void methodShouldThrowNullPointerException(){
        assertThrows(NullPointerException.class, ()-> new Library().getFirstBook(null));
    }

    @Test
    public void methodShouldThrowIllegalArgumentException(){
        Exception ex = assertThrows(IllegalArgumentException.class, ()-> new Library().getFirstBook(new ArrayList()));
        assertEquals("The list is empty", ex.getMessage());

    }
    @Test
    public void methodShoudThrowExcetionWhenAddingSgElse(){
        Library library = new Library();
        Exception ex = assertThrows(ClassCastException.class,()-> new Library().getFirstBook(Arrays.asList(12, "", "apple")));
        assertEquals("It is not a book", ex.getMessage());

    }



    @Test
    public void getFirstBookTest(){
        Library library = new Library();


       assertEquals("1984", new Library().getFirstBook(Arrays.asList(new Book("1984"), new Book("Animal Farm"), new Book("Vuk"))).getTitle());
    }



}