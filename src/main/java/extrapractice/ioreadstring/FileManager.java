package extrapractice.ioreadstring;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path myFile;
    private List<Human> humans = new ArrayList<>();

    public FileManager(String fileRelatiePath) {
        this.myFile = Path.of(fileRelatiePath);
    }

    public List<Human> getHumans() {
        return humans;
    }

    public Path getMyFile() {
        return myFile;
    }

    public void readFromFile() {

            try {
                List<String> fileInString = Files.readAllLines(myFile);
                for(String s : fileInString) {
                    String fullName[] = s.split(" ");
                    Human human = new Human(fullName[0], fullName[1]);
                    humans.add(human);
                }


            } catch (IOException ioe) {
                throw new IllegalStateException("Cannot read file", ioe);
            }

    }


}

