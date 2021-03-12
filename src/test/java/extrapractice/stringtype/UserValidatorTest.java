package extrapractice.stringtype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTest {

    UserValidator userValidator = new UserValidator();

    @Test
    void testIsValidUserName() {
        assertFalse(userValidator.isValidUserName(""));
        assertFalse(userValidator.isValidUserName(" "));
        assertTrue(userValidator.isValidUserName("abcdefgh"));

    }

    @Test
    void testIsValidPassWord() {

        assertTrue(userValidator.isValidPassWord("abcdefgh", "abcdefgh"));
        assertTrue(userValidator.isValidPassWord("abcdefghij", "abcdefghij"));
        assertFalse(userValidator.isValidPassWord(" ", " "));
        assertFalse(userValidator.isValidPassWord("abcdefghh", "abcdefghij"));

    }

    @Test
    void testIsValidEmail() {
        assertTrue(userValidator.isValidEmail("abcd@er.hu"));
        assertFalse(userValidator.isValidEmail("abckd.hu"));
        assertFalse(userValidator.isValidEmail("abckd.li@hu"));
        assertFalse(userValidator.isValidEmail("abckd@hu."));
    }
}