package ioreadbytes.byteacount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ByteCheckerTest {

    ByteChecker byteChecker = new ByteChecker();

    @Test
    void readBytesAndCountATest() {
        assertEquals(116, byteChecker.readBytesAndCountA("dataa.dat"));

    }

    @Test
    public void readBytesShouldThrowException(){
        assertEquals(116, byteChecker.readBytesAndCountA("dataaaa.dat"));

    }
}