package week14d03;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testCreateStudent(){
        Student student = new Student("Sarah");
        assertEquals("Sarah", student.getName());
    }

    @Test
    public void TestAddGradeToSubject(){
        Student student = new Student("Sarah");
        assertEquals(0, student.getGradesPerSubject().size());
        student.addGradeToSubject("biology", 5);
        assertEquals(1, student.getGradesPerSubject().size());
        student.addGradeToSubject("biology", 2);
        assertEquals(1, student.getGradesPerSubject().size());
        System.out.println(student.gradesPerSubject);

        student.addGradeToSubject("PE", 5);
        assertEquals(2, student.getGradesPerSubject().size());
        System.out.println(student.gradesPerSubject);

        assertEquals(2, student.getGradesPerSubject().get("biology").get(1));
        assertEquals(5, student.getGradesPerSubject().get("PE").get(0));

    }

}