package collectionsmap;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MapTest {

    @Test
    public void testMap() {
        Map<String, String> codes = new HashMap<>();
        assertEquals(true, codes.isEmpty());

        codes.put("200", "OK");
        codes.put("404", "not found");
        //System.out.println(codes.toString());

        Map<String, String> expected = new HashMap<>();
        expected.put("200", "OK");
        expected.put("404", "not found");

        assertTrue(expected.equals(codes));

        codes.put("404", "Not Found");  //felülírta a korábban berakott értéket.
        System.out.println(codes);

        String s = codes.get("404");
        assertEquals(true, s.equals("Not Found"));

        codes.put("304", "Not Modified");
        System.out.println(codes);

        codes.remove("304");            //kulcs alapján el lehet távolítani
        System.out.println(codes);
        assertEquals(false, codes.containsKey("304"));
        assertEquals(true, codes.containsValue("OK"));

        System.out.println(codes.keySet());     // le lehet kérni a kulcsokat
        System.out.println(codes.values());       // az értékeket is.

        System.out.println(codes.entrySet());       //Kulcs-értéket tartalmaz,  azt lehet lekérni.Set-et ad vissza, ciklussal bejárható
        for (Map.Entry entries : codes.entrySet()) {
            System.out.println(entries.getKey());
            System.out.println(entries.getValue());
        }
    }


        @Test
                public void testTrainersMap(){
        List<Trainer> trainers = Arrays.asList(
                new Trainer(1L, "John"),
                new Trainer(2L, "Jack"),
                new Trainer(3L, "Jane"),
                new Trainer(4L, "Joe")      //a hosszúlistában hosszú ideig tarthat a keresés.
        );

        Map<Long, Trainer> m= new HashMap<>();
        for(Trainer t : trainers){
            m.put(t.getId(), t);            //feltöltése ciklussal, a kulcs az egyedi azonosító legyen, az érték maga a trainer.
        }

        Trainer t =m.get(3L);
        assertEquals("Jane", t.getName());      //Sokkal gyorsabb,nem járja be a teljes listát, odaugrik az adott elemhez.

    }


}
