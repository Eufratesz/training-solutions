package week09d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PersonTest {

    @Test
    public void testOverFourteen(){
        Person person = new Person("Jim Smith", 26);

        person.setPresent();

        assertNotEquals(null, person.getPresent());
        assertNotEquals(Present.TOY, person.getPresent());
    }

    @Test
    public void tesetUnderFourteen() {
        Person person = new Person("Sam Smith", 10);
        person.setPresent();

        assertNotEquals(null, person.getPresent());
    }
}
