package iowriter.music;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BandTest {

    @Test
    public void testCreateBand(){
        Band band = new Band("Metallica", 1981);
        assertEquals("Metallica", band.getName());
        assertEquals(1981, band.getYear());

    }

}