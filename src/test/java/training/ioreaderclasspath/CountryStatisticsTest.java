package training.ioreaderclasspath;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountryStatisticsTest {

    private CountryStatistics cs = new CountryStatistics();


    @Test
    void listShouldBeCreated(){
        assertEquals(0, cs.getCountries().size());
        cs.getCountries().add(new Country("Austria", 7));
        assertEquals(0, cs.getCountries().size());

    }

    @Test
    void readFromFileTest() {
        assertEquals(cs.getCountries().size(), 0);
        cs.readFromFile("country.txt");
        assertEquals(8, cs.getCountries().size());

        assertEquals("Slovakia", cs.getCountries().get(2).getName());
        assertEquals(5, cs.getCountries().get(2).getNeighbours());

    }

    @Test
    void numberOfCountriesTest() {

        assertEquals(0, cs.numberOfCountries());
        cs.readFromFile("country.txt");
        assertEquals(8, cs.numberOfCountries());
    }

    @Test
    void maxNeighboursTest() {
        cs.readFromFile("country.txt");
        assertEquals("Germany", cs.maxNeighbours().getName());
        assertEquals(8, cs.maxNeighbours().getNeighbours());

    }
}