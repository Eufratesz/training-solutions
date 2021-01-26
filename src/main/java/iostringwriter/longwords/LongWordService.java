package iostringwriter.longwords;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class LongWordService {

    public void longWordWriter(List<String> longWords, Writer writer) {
        PrintWriter printWriter = new PrintWriter(writer);
        for (String word: longWords){
            printWriter.print(word);
            printWriter.print(";");
            printWriter.println(word.length());
        }
    }

    public String writeWithStringWriter(List<String> longWords) {
        try (StringWriter stringWriter = new StringWriter()) {
            longWordWriter(longWords, stringWriter);
            return stringWriter.toString();
        } catch (IOException ioe) {
            throw new IllegalStateException("Cannot write", ioe);
        }
    }
}

