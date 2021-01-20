package ioreadwritebytes.temperatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TemperaturesWriter {

    public void writeTemperatures(Temperatures termeratures, String pathString) {
        Path path = Path.of(pathString);
        try {
            Files.write(path, termeratures.getData());
        } catch (IOException e) {
            throw new IllegalArgumentException("Cannot write file, e");
        }
    }
}
