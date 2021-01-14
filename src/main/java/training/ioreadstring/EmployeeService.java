package training.ioreadstring;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public static void main(String[] args) {

        Path file = Path.of("employees.txt");

       // String content = null;
        List<String> content = null;

        try {
           // content = Files.readString(file);
            content = Files.readAllLines(file, Charset.forName("ISO-8859-2"));

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file",e);
        }
        System.out.println(content);
    }
}
