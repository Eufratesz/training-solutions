package week13d01;
/*
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Zipcode {

    private String name;
    private String zipcode;

    private List<Zipcode> zipcodes = new ArrayList<>();

    public Zipcode(String name, String zipcode) {
        this.name = name;
        this.zipcode = zipcode;
    }

    public String getName() {
        return name;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void readZipcodesAndCities() {

        Path file = Path.of("zipcodes_and_cities");
        try (BufferedReader br = Files.newBufferedReader(file)) {
            String line;
            while ((line = br.readLine()) != null) {
                String[]temp = line.split(";");
                Zipcode zipcode= new Zipcode(temp[0],temp[1]);
                zipcodes.add(zipcode);
            }
        } catch (
                IOException ioe) {
            throw new IllegalStateException("Cannot read file");

        }
    }

    public String findLongestName(){
        Path file = Path.of("zipcodes_and_cities");
        String result = null;


        for(Zipcode city: zipcodes) {
            if(city.getName().length()
                    city.getName().length()){

            }
        }
    }



}


 */