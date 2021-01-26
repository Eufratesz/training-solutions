package iostringwriter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {

    public void writeEmployees(Writer writer) {
        List<String> employees = List.of("John Doe", "Jane Doe", "Jack Doe");
        PrintWriter printWriter = new PrintWriter(writer);
        for (String employee : employees) {
            printWriter.print(employee);
            printWriter.print(",");
            printWriter.println(200_000);
        }
    }

    public static void main(String[] args) {
        Path file = Path.of("employeesiostringwriter.txt");

        try (StringWriter stringWriter = new StringWriter()) {      //A StringWriter a konzolra ír.
            new EmployeeService().writeEmployees(stringWriter);
            System.out.println(stringWriter.toString());
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }
}
        /* A BufferedWriter fájlba ír
        try (BufferedWriter writer = Files.newBufferedWriter(file)) {
            new EmployeeService().writeEmployees(writer);
            }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }

         */

