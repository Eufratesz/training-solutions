package ioreadbytes.demo;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class EmployeeService {

    public static void main(String[] args) {
        Path path = Path.of("dataioreadbytes.dat");
        try(InputStream inputStream =Files.newInputStream(path)){
            byte[] buffer = new byte[1000];
            int size = 0;
            while((size = inputStream.read(buffer))> 0){
                System.out.println(Arrays.toString(buffer));
                System.out.println(size);
            }

        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot read file", ioe);
        }
    }
}
