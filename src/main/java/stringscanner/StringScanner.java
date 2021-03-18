package stringscanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringScanner {

    public int readAndSumValues(String intString, String delimiter) {

        try (Scanner scanner = new Scanner(intString)) {
            if (!isEmpty(delimiter)) {
                scanner.useDelimiter(delimiter);
            }
            return calculateWithScanner(scanner);
        }
    }

    private int calculateWithScanner(Scanner scanner) {
        int sum = 0;
        try {
            while (scanner.hasNext()) {
                sum += scanner.nextInt();
            }
        } catch (InputMismatchException ex) {
            throw new IllegalArgumentException("incorrect paremeter in string!", ex);
        }
        return sum;
    }

    public int readAndSumValues(String intString) {
        return readAndSumValues(intString, null);

    }

    public String filterLinesWithoutWordOccurences(String text, String word) {
        if (isEmpty(text) || "".equals(word) || word == null) {
            throw new IllegalArgumentException("Wrong parameter!");
        }
        try (Scanner scanner = new Scanner(text)) {
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(word)) {
                    sb.append(line);
                    sb.append("\n");
                }
            }
            return sb.toString().trim();
        }
    }


    private boolean isEmpty(String str) {
        return str == null || "".equals(str.trim());
    }
}
