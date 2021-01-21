package training.iostringwriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public void writeEmployees(Writer writer){
        List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
        PrintWriter printWriter = new PrintWriter(writer);
        for (String employee : employees) {
            printWriter.print(employee);
            printWriter.print(",");
            printWriter.print(200_000);
        }
    }

    public static void main(String[] args) {
        Path file = Path.of("src/main/java/training/iostringwriter/employeestringwriter.txt");
/*
Létrehozza a fájlt:

        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            new EmployeeService().writeEmployees(writer);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file");
        }

        Memóriába gyűjtötte, és a Console-ra kiírta:
 */
       try (StringWriter stringWriter = new StringWriter()) {
        new EmployeeService().writeEmployees(stringWriter);
           System.out.println(stringWriter.toString());
    }
       catch (IOException ioe) {
           throw new IllegalStateException("Cannot write", ioe);
       }

}}
