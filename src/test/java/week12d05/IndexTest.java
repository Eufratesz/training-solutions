package week12d05;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class IndexTest {

    @Test
    void findKoronavirusTest() {
        Path path =Path.of("src/main/resources/Index.html");
        Index index = new Index();
        int n =index.findKoronavirus();
        assertEquals(7, index.findKoronavirus());
    }
}