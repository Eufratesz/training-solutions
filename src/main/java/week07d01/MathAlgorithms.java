/*
Készíts egy osztályt a week07d01 csomagba MathAlgorithms néven. Ebben az osztályban legyen egy isPrime(int x) metódus
 ami a paraméterül kapott számról eldönti, hogy prím-e vagy sem és ennek megfelelően true vagy false értékkel tér
 vissza. Aki már tart ott és tudja mit jelent a static az nyugodtan implementálhatja a metódust statikus metódusként.
  Az egyszerűség kedvért a prímeket most csak a pozitív egész számok körében értelmezzük, így bónuszként rá lehet
  ellenőrizni, hogy x>0  és ha nem akkor kivételt dobni.
Prímeknek tekintjük azokat számokat melyek csak egyel és önmagukkal oszthatók, tehát a 2,3,5,7,11,13 stb. Teszt!!
 */

package week07d01;

public class MathAlgorithms {

    private int x;
    private int y;


    public boolean isPrime(int x) {
        int x != int y;
        if (x == 0 || x ==1) throw new IllegalArgumentException("Nem primszám.");
        if (x< 0) throw new IllegalArgumentException("Negatív szám.");
        if ( x %  y > 1) {
            return true;
        }
    }


}
