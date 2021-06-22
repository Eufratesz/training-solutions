package aaa.week04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    void setName(){
        NameChanger nameChanger = new NameChanger("Kovács István");

        assertEquals("Kovács István", nameChanger.getFullName());

    }
//    @Test
//    void testExceptionWhenSetName(){
//        NameChanger nameChanger = new NameChanger("");
//        assertThrows(IllegalArgumentException, nameChanger.getFullName());
//    }

    @Test
    void testChangeFirstName(){
        NameChanger nameChanger = new NameChanger("Kovács István");

        assertEquals("Kovács József", nameChanger.changeFirstName("József"));

    }

}