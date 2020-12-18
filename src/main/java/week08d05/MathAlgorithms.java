/*
A week08d05 csomagban készíts egy osztályt MathAlgorithms néven. Legyen benne egy metódus, greatestCommonDivisor() ,
ami paraméterül vár két pozitív egész számot és visszaadja a legnagyobb közös osztójukat.
 */

package week08d05;

public class MathAlgorithms {

    public int greatestCommonDivisor(int a, int b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("A szám pozitív legyen!");
        }

        while (a != b) {
            if (a > b) {
                a = a - b;
                } else {
                b = b - a;
               }
        }
        return a;
    }


}
