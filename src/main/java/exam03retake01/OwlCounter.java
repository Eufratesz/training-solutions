package exam03retake01;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class OwlCounter {
    Path file = Path.of("owls.txt");

    public Map<String, Integer> readFromFile(File file) {
        try (BufferedReader reader = Files.newBufferedReader(file)) {
            Map<String, Integer>result = new HashMap<>();
            String line;
            while ((line = reader.readLine(reader) != null)) {
                System.out.println(line);
                result.put(line);

            }
            return result;
        }
        catch(IOException ioe){
                throw new IllegalStateException("Cannot read file", ioe);
            }

    }

        public int getNumberOfOwls (String county){
            Map<String, Integer> countOwls= new HashMap<>();
            int count=0;
            for(String owl: owls){
                count.put(owl,1);
                count++;

            }
            return count;

        }
    }



