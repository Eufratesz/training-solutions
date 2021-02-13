package ioprintwriter.talentshow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductionTest {

    Production p = new Production(1, "The_Artist");

    @Test
    void testCreateProduction() {
        assertEquals(1, p.getId());
        assertEquals("The_Artist", p.getName());
    }

}