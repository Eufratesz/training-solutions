package training.ioreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {


    public static void main(String[] args) {
        Path file =Path.of("employee3.txt");

        try (BufferedReader reader= Files.newBufferedReader(file)) {
            String line;
           // line = reader.readLine();  Az első sor beolvasására

            while ((line = reader.readLine()) != null)       //amíg van sor, addig olvassa
            System.out.println(line);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
