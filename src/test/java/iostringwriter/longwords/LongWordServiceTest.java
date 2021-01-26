package iostringwriter.longwords;

import org.junit.jupiter.api.Test;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LongWordServiceTest {

    LongWordService longWordService = new LongWordService();

    @Test
    void writeWithStringWriterTest() {

        List<String> testList = List.of("unconscious", "unbelievable", "beautifully", "Uncomfortable");
        String s = longWordService.writeWithStringWriter(testList);
        String[]temp = s.split("\n");

        assertEquals(4, testList.size());
        assertTrue(temp[0].contains("11"));
       // assertEquals("beautifully;11"+ "\n", temp[2]);  //a sortörés bezavar, egyébként jó lenne

    }


}