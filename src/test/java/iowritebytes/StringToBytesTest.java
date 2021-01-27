package iowritebytes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringToBytesTest {

    @TempDir
    public File folder;

    @Test
    void writeAsBytesTest() throws IOException {
        List<String> words = List.of("apple", "_pear", "_banana", "plum");
        Path path = new File(folder, "words.dat").toPath();
        StringToBytes stringToBytes = new StringToBytes();
        stringToBytes.writeAsBytes(words, path);

        byte[] bytes = readBytes(path);             //itt elakadtam.
        byte[]content ="appleplum".getBytes();

        assertArrayEquals(content, bytes);

    }

    private byte[]readBytes(Path path) throws IOException{
        return Files.readAllBytes(path);
    }
}