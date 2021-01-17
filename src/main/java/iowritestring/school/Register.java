package iowritestring.school;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

//feladatkiírásban az osztály neve Diary.
public class Register {


    // A feladatkiírásban a tanuló nevét és egy jegyet vár paraméterben)
    public void newMark(Path file, int mark) {
        try {
            if (Files.exists(file)) {
                Files.writeString(file, mark + "\n", StandardOpenOption.APPEND);
            } else {
                Files.writeString(file, Integer.toString(mark));
            }
        } catch (IOException e) {
            throw new IllegalStateException("Cannot open file", e);
        }

    }

    public void average(Path file) {
        try {
            List<String> myFile = Files.readAllLines(file);
            Double sum = 0.0;
            for (String s : myFile) {
                sum += Double.parseDouble(s);
              //  double average = sum / myFile.size();  blokkon kívül úgysem látszik, újra ki kell írni
            }
            Files.writeString(file, "average: " + (sum/myFile.size()), StandardOpenOption.APPEND);

        } catch (IOException e) {
            throw new IllegalStateException("Cannot open file", e);
        }
    }

}
