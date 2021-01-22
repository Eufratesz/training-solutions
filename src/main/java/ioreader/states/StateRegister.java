package ioreader.states;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StateRegister {

    private List<State> states = new ArrayList<>();


    public void readStatesfromFile(String fileName) {
        Path path = Path.of("src/main/resources/" + fileName);
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] temp = line.split("-");
                State state = new State(temp[0], temp[1]);
                states.add(state);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file");
        }
    }


    public String findCapitalByStateName(String stateName) {
        for (State state : states) {
            if (stateName.equals(state.getStateName()))
                return state.getCapital();
        }
        throw new IllegalArgumentException("The state does not exist!");
    }

    public List<State> getStates() {
        return new ArrayList<>(states);
    }
}

