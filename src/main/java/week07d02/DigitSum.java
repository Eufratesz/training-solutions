/*
Mai Junior/Mid-level feladat:
        Készíts egy week07d02.DigitSum osztályt és benne sumOfDigits(int x) metdus mely visszaadja a paraméterül
        kapott szám számjegyeinek összegét! pl.: 123 esetén a visszatérési érték 6.
*/



package week07d02;

public class DigitSum {

    public static int sumOfDigits(int x) {
        int sum = 0;
        while (x != 0) {
            sum = sum + x%10 ;
            x = x/10;
        }
        return sum;
    }
}


/*
Más megoldás:
public class DigitSum {
    public int sumOfDigits(int x) {
        String digits =Integer.toString(x);
        int sum =0;
            for (int i =0; i < digit.lenght(); i++){
            sum+= (Integer.parseInt(digit.substring(i, i+1)));
 */


