package iowritebytes;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {

    public static void main(String[] args) {
        Path path = Path.of("dataoutputstreambyte.dat");
        try (BufferedOutputStream os = new BufferedOutputStream(Files.newOutputStream(path))) {
            for (int i = 0; i < 1100; i++) {
//                   os.write(97);  //Létrehozta a fájlt, benne egy 'a' karakterrel.
                os.write("abcde".getBytes());
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }
}
