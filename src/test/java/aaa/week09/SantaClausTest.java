package aaa.week09;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SantaClausTest {

    @Test
    void testGetThroughChimneys() {
        SantaClaus sc = new SantaClaus(Arrays.asList(
                new Person("Jim Smith", 10),
                (new Person("Sarah", 8)),
                (new Person("Peter", 16))
        ));
        sc.getThroughChimneys();

    }
}