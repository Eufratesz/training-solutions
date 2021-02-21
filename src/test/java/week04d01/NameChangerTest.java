package week04d01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NameChangerTest {

    @Test
    void testCreateFirstNameAndSurname() {
        //Given
        NameChanger nameChanger = new NameChanger("Nagy Katalin");
        //When
        assertEquals("Nagy Katalin", nameChanger.getFullName());


        //Then
    }

    @Test
    void testCreateWithNoParameter(){
        //Given
        NameChanger nameChanger = new NameChanger("");
        //When
       IllegalArgumentException iae= assertThrows(IllegalArgumentException.class, ()-> new NameChanger(""));
       assertEquals("Invalid Name: ", iae.getMessage());


    }



    @Test
    void testChangeFirstName() {
        //Given
        NameChanger nameChanger = new NameChanger("Nagy Katalin");
        //When
        nameChanger.changeFirstName("Anna");
        //Then
        assertEquals("Nagy Anna", nameChanger.changeFirstName("Anna"));
    }
}