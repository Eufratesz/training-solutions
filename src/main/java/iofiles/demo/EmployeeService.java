package iofiles.demo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class EmployeeService {

//    public static void main(String[] args) {
//        Path path = Path.of("dataoutputstreambyte.dat"); //("abcde"-t tartalmazza 1100-szor)
//        System.out.println(Files.exists(path));                 //true, mert létezik
//        System.out.println(Files.isDirectory(path));            //false, mert nem könyvtár
//        System.out.println(Files.isRegularFile(path));          //true
//        try {
//            System.out.println(Files.size(path));                   //IOEx-t dob- try-catch-be kell tenni
//        } catch (IOException e) {
//            throw new IllegalStateException("Cannot get size", e);  //5500
//        }
//    }

    public static void main(String[] args) {
//        Path path = Path.of("dataoutputstreambyte.dat");
//        try {
//            Files.copy(path, Path.of("dataoutputstreambyte2.dat"));
//        } catch (IOException e) {
//            throw new IllegalStateException("Cannot copy", e);
//        }
        try {
            Files.delete(Path.of("dataoutputstreambyte2.dat"));
        } catch (IOException e) {
            throw new IllegalStateException("Cannot delete", e);
        }
    }
}
