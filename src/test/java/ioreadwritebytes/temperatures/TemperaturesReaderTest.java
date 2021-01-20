package ioreadwritebytes.temperatures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class TemperaturesReaderTest {

    @TempDir
    public File folder;

    public byte[]data = new byte[365];
    private String pathString;

    @BeforeEach
    public void init() throws IOException {
        Random random = new Random(5);
        random.nextBytes(data);
        Path path = new File(folder, "temperatures2020.dat").toPath();
        pathString = path.toString();

        Files.write(path, data);
    }


    @Test
    public void testReadTemperatures() {
        TemperaturesReader temperaturesReader = new TemperaturesReader();

        Temperatures temperatures = temperaturesReader.readTemperatures(pathString);
        assertArrayEquals(data, temperatures.getData());
    }
}