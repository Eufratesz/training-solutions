package ioreadstring.names;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileManagerTest {

    private FileManager fileManager = new FileManager("src/main/resources//ioreadstring/names.txt");

    @Test
    public void testClassCreate() {
        assertEquals("names.txt", fileManager.getFile().getFileName().toString());
        assertEquals(0, fileManager.getHumanList().size());
    }

    @Test
    public void testReadFromFile() {
        fileManager.readFromFile();
        assertEquals(6, fileManager.getHumanList().size());
        assertEquals("Jack", fileManager.getHumanList().get(2).getFirstName());
        assertEquals("Doe", fileManager.getHumanList().get(2).getSurname());
        assertEquals("Brian", fileManager.getHumanList().get(5).getFirstName());
        assertEquals("Thomas", fileManager.getHumanList().get(5).getSurname());

    }

}