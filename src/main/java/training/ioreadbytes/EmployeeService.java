package training.ioreadbytes;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class EmployeeService {

    public static void main(String[] args) {
        Path path = Path.of("dataioreadbytes.dat");
        try(InputStream inputStream =Files.newInputStream(path)) {
            byte[] buffer = new byte[100];                  //összesen 272 'a'betű
            int size = 0;                                       //1 sorban 100 '97', következő sorban a darabszám
            while((size= inputStream.read(buffer))>0) {

            System.out.println(Arrays.toString(buffer));
            System.out.println(size);
        }
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
