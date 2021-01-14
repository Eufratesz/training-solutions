package training.iowritestring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class EmployeeService {
    public static void main(String[] args) {
        Path file = Path.of("emplyees2.txt");
        try {
            //Files.writeString(file, "John Doe", StandardOpenOption.APPEND);
            Files.writeString(file, "John Doe\nJane Doe\n");

           // Files.write(file, List.of("John Doe", "Jane Doe"));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot write file", e);
        }
    }
}
