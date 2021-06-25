package aaa.week07;

/*
Készíts egy osztályt MathAlgorithms néven. Ebben az osztályban legyen egy isPrime(int x) metódus ami a paraméterül
kapott számról eldönti, hogy prím-e vagy sem és ennek megfelelően true vagy false értékkel tér vissza.
Aki már tart ott és tudja mit jelent a static az nyugodtan implementálhatja a metódust statikus metódusként.
Az egyszerűség kedvért a prímeket most csak a pozitív egész számok körében értelmezzük, így bónuszként rá lehet
ellenőrizni, hogy x > 0, és ha nem, akkor kivételt dobni. Prímeknek tekintjük azokat számokat melyek csak egyel és
önmagukkal oszthatók, tehát a 2, 3, 5, 7, 11, 13 stb.
 */

public class MathAlgorithms {

    public boolean isPrime(int x){
        if ( x < 1 ){
            throw new IllegalArgumentException("Nem pozitív egész szám!");
        }
        //megszámolom, hány osztója van az adott számnak.
        int count = 0;
        for( int i = 1; i <=x; i++){
            if(x % i == 0){
                count++;
            }
        }
        if(count == 2){ // ha pont 2 osztója van: azaz 1 és önmaga, igazat ad vissza.
            return true;
        }
        return false;
    }
}
