package filescanner;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class FileScannerClasspathMain {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(FileScannerClasspathMain.class.getResourceAsStream("/scannerclasspathemployees.txt"))) {
            while (scanner.hasNextLine()) {
                String row = scanner.nextLine();
                System.out.println(row);
            }
        }
    }
}
