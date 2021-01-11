/*
Készítsünk egy DivisorFinder nevű osztályt, melynek van egy int findDivisors(int n) metódusa. A feladat az, hogy
megnézzük a szám minden egyes számjegyére, hogy osztója-e a számnak, majd számoljuk össze őket. Példa: a 425-ben
az 5 osztója a számnak, ezért a visszatérési érték 1.
 */
package week11d01;



public class DivisorFinder {

    public int findDivisors(int n) {
         int sumOfDivisors = 0;

        for (int i = 1; i < n; i++) {
            if( i == 0) throw new ArithmeticException("Can't divide by 0");
            if (n % i ==0) {
                sumOfDivisors++;
            }
        }
        return sumOfDivisors;
    }
}
