package week15d05;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class GameOfThrones {

    private final Map<String, Integer> mapOfHouses = new HashMap<>();

    public void readFromFile(Path file) {
        try (BufferedReader reader = Files.newBufferedReader(file)){
            reader.readLine(); //a fejlécet hagyjuk ki.
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file!", ioe);
        }

    }

    private void processLine(String line) {  //Set: csak egyszer számítja a házat (támadó, védő ugyanaz, ne vegye kétszer)
        String[]splitLine = line.split(",");
        Set<String>participants = new HashSet<>(Arrays.asList(splitLine).subList(5,13));
        for(String house: participants) {       // a házak nevei: 5-12.indexig. (13.már nem)
            if( ! house.isEmpty()) {
                putMap(house);
            }
        }
    }

    private void putMap(String house) {
        if (!mapOfHouses.containsKey(house)){
            mapOfHouses.put(house, 1);
        }
        mapOfHouses.put(house, mapOfHouses.get(house)+1);
    }

    public String sortedData(){
        List<Battle>sortedList = new ArrayList<>();
        for (String key : mapOfHouses.keySet()) {
            sortedList.add(new Battle(key, mapOfHouses.get(key)));
        }
        sortedList.sort(Comparator.comparingDouble(Battle::getNumber).reversed());
        return sortedList.get(0).getHouse();
    }

    public Map<String, Integer> getMapOfHouses() {
        return new HashMap<>(mapOfHouses);
    }



    public static void main(String[] args) {
        GameOfThrones gameOfThrones = new GameOfThrones();
        Path file = Path.of("battles.csv");
        gameOfThrones.readFromFile(file);

        System.out.println(gameOfThrones.sortedData());         //A legtöbbet harcoló ház neve
        System.out.println(gameOfThrones.getMapOfHouses());       //Az összes ház: ház neve = csaták száma
    }

}


