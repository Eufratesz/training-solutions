package training.ioreaderclasspath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryTest {

    private Country country = new Country("Spain", 3);

    @Test
    public void countryShouldCreate(){
        assertEquals("Spain", country.getName());
        assertEquals(3, country.getNeighbours());
    }

}