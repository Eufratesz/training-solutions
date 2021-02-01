package collectionsmap;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LogParserTest {

    @Test
    public void faultyLogShouldThrowException(){
        String log = "invalid_log_format";

        Exception ex = assertThrows(IllegalArgumentException.class, ()-> {
            new LogParser().parseLog(log);
        });
        assertEquals("Incorrect log: incorrect number of fields", ex.getMessage());
    }

    @Test
    public void invalidDateFormatShouldThrowException(){
        //Given
        String log = "176.121.45.124:20210201:anett\n";

        Exception ex= assertThrows(IllegalArgumentException.class, ()->{
            new LogParser().parseLog(log);
        });
        assertEquals("Incorrect log: incorrect date", ex.getMessage());
    }

    @Test
    public void entrieWithSameIpShouldBeInSameList() {
        //Given
        String log = "176.121.45.124:2021-02-01:anett\n"
                + "176.121.45.124:2021-02-05:gabor\n";

        //When
        Map<String, List<Entry>> entries = new LogParser().parseLog(log);

        //Then
        assertEquals(1, entries.size());
        assertEquals(2, entries.get("176.121.45.124").size());
        assertEquals("anett", entries.get("176.121.45.124").get(0).getLogin());
        assertEquals("176.121.45.124", entries.get("176.121.45.124").get(0).getIp());
        assertEquals(LocalDate.of(2021, 2,1), entries.get("176.121.45.124").get(0).getEntryDate());
    }

}