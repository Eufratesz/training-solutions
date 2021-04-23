package ioconvert.demo;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {

//    public static void main(String[] args) {
//        Path path = Path.of("dataprintstream.dat");
//        try(Writer os = new OutputStreamWriter(new BufferedOutputStream(Files.newOutputStream(path)))){
//            os.write("Jim Doe");
//        }
//        catch (IOException ioe){
//            throw new IllegalStateException("Cannot write file", ioe);
//        }
//    }

    public static void main(String[] args) {
        Path path = Path.of("dataprintstream.dat");
        try(PrintStream os = new PrintStream(new BufferedOutputStream(Files.newOutputStream(path)))){
            os.println("Jane Doe");
        }
        catch (IOException ioe){
            throw new IllegalStateException("Cannot write file", ioe);
        }
    }
}
