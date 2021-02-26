package exam03retake02;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BalatonStorm {

    public List<String> getStationsInStorm(BufferedReader reader) throws IOException {
        List<String> stations = new ArrayList<>();

        String line;
        while ((line = reader.readLine()) != null) {
            String[] part = line.split(":");
            List<String>temp = null;
            if (part[0].equals("level") && part[1].equals(Integer.parseInt("3"))) ;
            temp.add(part[0]);

        }
        return stations;

    }

}





