package ioreadstring.names;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileManager {

    private Path file;
    private List<Human> humanList = new ArrayList<>();

    public FileManager(String fileRelativePath) {
        this.file = Path.of(fileRelativePath);
    }

    public void readFromFile(){
        try {
            List<String> fileInString = Files.readAllLines(file);
            for (String s : fileInString) {
                String firstNameAndSurname[] = s.split(" ");
                Human human = new Human(firstNameAndSurname[0], firstNameAndSurname[1]);
                humanList.add(human);
            }
        }catch (IOException e) {
            throw new IllegalStateException("Cannot read file", e);
            }
    }
// Ne felejtsek el gettereket generálni!
    public Path getFile() {
        return file;
    }

    public List<Human> getHumanList() {
        return humanList;
    }
}



