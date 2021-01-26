package week13d01;
/*
A GitHubon a `examples\week13d01\src\main\resources\iranyitoszamok-varosok-2021.csv` fájl tartalmazza a magyar városok listáját.
Add vissza a leghosszabb nevű várost!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Zipcode {

    public String maxtLengthCityFromFile(String fileName) {
        String maxLength ="";
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {
            String line;
            skipHeader(br);
            while ((line= br.readLine())!= null) {
                String[] splittedLine = line.split(";");
                if(splittedLine[1].length() > maxLength.length()) {
                    maxLength = splittedLine[1];
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);

        }
        return maxLength;

        }
        //a whitespace-eket hagyja figyelmen kívül.
        private String splitLine(String line) {
        String[]temp = line.split(";");
        return temp[1].trim();
    }
// ne vegye figyelembe a legelső sort, a táblázat fejlécét:
    private void skipHeader(BufferedReader bufferedReader) throws IOException {
        bufferedReader.readLine();
    }

    public static void main(String[] args) {
        Zipcode zc = new Zipcode();
    }
}






    //private List<Zipcode> cities = new ArrayList<>();
/*
    public void readAndAddCities() {



            String line;
            while ((line = br.readLine()) != null) {
                String[]temp = line.split(";");
                Zipcode zipcode= new Zipcode(temp[0],temp[1]);
                zipcodes.add(zipcode);
                for(zipcode : zipcodes){
                   if(zipcode.getName().length()
                           temp[1].length()
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


