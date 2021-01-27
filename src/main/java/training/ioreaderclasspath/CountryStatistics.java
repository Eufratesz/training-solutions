package training.ioreaderclasspath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {

    private List<Country> countries = new ArrayList<>();

    public void readFromFile(String fileName) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(CountryStatistics.class.getResourceAsStream("/" + fileName)))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] temp = line.split(" ");
                Country country = new Country(temp[0], Integer.parseInt(temp[1]));
                countries.add(country);
            }

        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);
        }

    }

    public int numberOfCountries() {
        return countries.size();
    }

    public Country maxNeighbours() {
        Country max = countries.get(0);
        for (Country country : countries) {
            if (country.getNeighbours() > max.getNeighbours()) {
                max = country;
            }
        }
        return max;
    }

    public List<Country> getCountries() {
        return new ArrayList<>(countries);
    }
}



