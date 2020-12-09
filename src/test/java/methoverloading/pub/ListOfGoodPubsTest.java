package methoverloading.pub;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ListOfGoodPubsTest {

    @Test
    public void emptyPubListShouldThrowException() throws IllegalArgumentException{
        Exception ex = assertThrows(IllegalArgumentException.class, () -> new ListOfGoodPubs(new ArrayList<>()));
        assertEquals("Pub list is empty!", ex.getMessage());
    }

    @Test
    public void TestFindTheBest() {
        ListOfGoodPubs goodPubs = new ListOfGoodPubs(Arrays.asList(
                new Pub ("Hörpintő", 10,0),
                new Pub ("Pancser Borozó", 12,30),
                new Pub("Nemegri Borozó", 9, 0),
                new Pub ("Törpi kocsma", 9, 30 )
        ));
        assertEquals("Nemegri Borozó; 9:0", goodPubs.findTheBest().toString());
    }

}
