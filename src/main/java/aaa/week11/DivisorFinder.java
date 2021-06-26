package aaa.week11;

/*
Készítsünk egy DivisorFinder nevű osztályt, melynek van egy int findDivisors(int n) metódusa. A feladat az, hogy
megnézzük a szám minden egyes számjegyére, hogy osztója-e a számnak, majd számoljuk össze őket. Példa: a 425-ben az 5
osztója a számnak, ezért a visszatérési érték 1.
 */


public class DivisorFinder {

    public int findDivisors(int n) {
        int result = 0;
        String stringnumber = Integer.toString(n);
        for (int i = 0; i < stringnumber.length(); i++) {
            if (n % Integer.parseInt(String.valueOf(stringnumber.charAt(i))) == 0) {
                result++;
            }
        }

        return result;
    }
}
