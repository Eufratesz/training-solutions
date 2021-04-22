package iodatastream;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {

    public static void main(String[] args) {
        Path path = Path.of("dataoutputstream.dat");
        try (DataOutputStream os = new DataOutputStream(new BufferedOutputStream(Files.newOutputStream(path)))) {
            os.writeUTF("John Doe");
            os.writeInt(200_000);

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write file", ioe);
        }

        try (DataInputStream is = new DataInputStream(new BufferedInputStream(Files.newInputStream(path)))) {
            String name = is.readUTF();
            int salary = is.readInt();
            System.out.println(name + " " + salary);
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
