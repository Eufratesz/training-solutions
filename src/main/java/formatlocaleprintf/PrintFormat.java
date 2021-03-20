package formatlocaleprintf;

import java.util.IllegalFormatException;
import java.util.Locale;

public class PrintFormat {

    public String formatMessageWithIntegerParameters(String formatString, Integer i, Integer j) {
        try {
            return String.format(new Locale("hu", "HU"), formatString, i, j);
        } catch (IllegalFormatException ife) {
            throw new IllegalArgumentException("Less objects then expected in format String!", ife);
        }
    }


    public String printFormattedText(double number) {
        String formatString = "Total is: %.2f Ft";
        return String.format(new Locale("hu", "HU"), formatString, number);
    }

    public String printFormattedText(int count, String fruit){
        String formatString = "We counted %d %s in the basket";
        return String.format(new Locale("hu", "HU"), formatString, count, fruit);
    }

    public String printFormattedText(int number){
        String formatString = "Right edge of numbers set at %d spaces from text:   ";
        return String.format(new Locale("hu", "HU"), formatString, number);
    }

    public String printFormattedText(Integer i, Integer j, Integer k){
        String formatString = "Multiple objects containing text:" + i + "\t" + j + "\t";
        return String.format(new Locale("hu", "HU"), formatString, i, j, k);
    }


}
