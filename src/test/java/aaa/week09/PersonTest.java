package aaa.week09;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void testSetPresentOverFourteen() {
        Person p = new Person("John Doe", 16);
        p.setPresent();
        assertNotEquals(null, p.getPresent());
        assertNotEquals(Present.TOY, p.getPresent());

    }

    @Test
    void testSetPresentUnderFourteen(){
        Person p = new Person("John Doe", 12);
        p.setPresent();
        assertNotEquals(null, p.getPresent());
    }

}