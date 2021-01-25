package week12d05;
//Konzultáción általánossá tettük a metódust (István megoldása)

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoronaVirusFinder {

    public int searchCorona(Path path, String word) {
        int counter = 0;

        try (BufferedReader bf = Files.newBufferedReader(path)) {
            String line;

            while ((line = bf.readLine()) != null) {

                if (line.contains(word)) {
                    counter++;
                }

            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file");
        }
        return counter;
    }

    public static void main(String[] args) {
        CoronaVirusFinder cvf = new CoronaVirusFinder();
        Path path = Path.of("src/main/resources/Index.html");
        System.out.println(cvf.searchCorona(path, "koronavírus"));
    }
}
