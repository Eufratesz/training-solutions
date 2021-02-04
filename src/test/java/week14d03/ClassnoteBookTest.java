package week14d03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ClassnoteBookTest {

    @Test
    void TestSortNotebook() {
        //Given
        List<Student> studentList = Arrays.asList(new Student("Joe"), new Student("Susan"), new Student("Jim"));

        //When
        ClassnoteBook classnoteBook = new ClassnoteBook(Arrays.asList());
        //Then

    }
}