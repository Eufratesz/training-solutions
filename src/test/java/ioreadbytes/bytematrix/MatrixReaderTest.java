package ioreadbytes.bytematrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixReaderTest {

    MatrixReader mr = new MatrixReader();

    @Test
    void readBytesTest() {
        assertEquals(0, mr.getMatrix().size());
        mr.readBytes("matrix.dat");

        assertEquals(10, mr.getMatrix().size());
        assertEquals(1000, mr.getMatrix().get(9).length);
    }

    @Test
    void columnCounterWithMoreZerosTest() {
        mr.readBytes("matrix.dat");
        assertEquals(492, mr.columnCounterWithMoreZeros());
    }
}