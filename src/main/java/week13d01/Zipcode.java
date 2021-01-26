package week13d01;
/*
A GitHubon a `examples\week13d01\src\main\resources\iranyitoszamok-varosok-2021.csv` fájl tartalmazza a magyar városok listáját.
Add vissza a leghosszabb nevű várost!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class Zipcode {

    public String maxtLengthCityFromFile(String fileName) {
        String result = "";
        try (BufferedReader br = Files.newBufferedReader(Path.of(fileName))) {

            skipHeader(br);
            result = maxLengthCity(br);


        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot read file", ioe);

        }
        return result;
    }

    private String maxLengthCity(BufferedReader br) throws IOException {
        String maxLength = "";
        int lineNumber = 0;
        String line;
        while ((line = br.readLine()) != null) {
            String city = splitLine(line, lineNumber);
            if (city.length() > maxLength.length()) {
                maxLength = city;
            }
        }
        return maxLength;
    }


    //a whitespace-eket hagyja figyelmen kívül.
    private String splitLine(String line, int lineNumber) throws IOException {
        String[] temp = line.split(";");
        if (temp.length > 0) {
            return temp[1].trim();
        }
        throw new IOException("Wrong: " + line + "In line" + lineNumber);
    }

    // ne vegye figyelembe a legelső sort, a táblázat fejlécét:
    private void skipHeader(BufferedReader bufferedReader) throws IOException {
        bufferedReader.readLine();
    }
}










