package controladvanced;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    public List<String> filterLines(List<String> lines) {
        List<String> validLines = new ArrayList<>();
        for (String line : lines) {
            String[] parts = line.split(";");
            if (parts.length != 4) {
                continue;
            }
            String numberPlate = parts[0];
            int year = Integer.parseInt(parts[1]);

            if (numberPlate.length() == 7 && numberPlate.contains("-")
                    && year > 1970 && year < 2019) {

                validLines.add(line);
            }
        }
        return validLines;
    }
}
