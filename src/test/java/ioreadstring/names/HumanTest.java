package ioreadstring.names;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    @Test
    public void testCreatehuman() {
        Human human = new Human("John", "Doe");
        assertEquals("John", human.getFirstName());
        assertEquals("Doe", human.getSurname());
    }

}