package ioreadstring;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EmployeeService {
    /*
// String beolvasása. Karakterkódolást is megadtunk.
    public static void main(String[] args) {
        Path file = Path.of("employees1.txt");
        String content = null;
        try {
            content = Files.readString(file, Charset.forName("ISO-8859-2"));

        } catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
        }
        System.out.println(content);
    }

     */

    public static void main(String[] args) {
        Path file = Path.of("employees1.txt");
        List<String>content = null;
        try{
            content = Files.readAllLines(file, Charset.forName("ISO-8859-2"));
        }catch (IOException ioe){
            throw new IllegalStateException("Cannot read file");
        }
        System.out.println(content);
    }
}
