package aaa.week07;
/*
Készíts egy DigitSum osztályt és benne sumOfDigits(int x) metódus mely visszaadja a paraméterül kapott szám
számjegyeinek összegét! pl.: 123 esetén a visszatérési érték 6.
 */

import static java.lang.Character.getNumericValue;

public class DigitSum {

    public int sumOfDigits(int x){
        String number = Integer.toString(x);
        int sum = 0;
        for(int i =0; i < number.length(); i++){
            sum += Character.getNumericValue(number.charAt(i));

        }
        return sum;
    }

    public static void main(String[] args) {
        DigitSum ds = new DigitSum();
        System.out.println(ds.sumOfDigits(123));  //6
        System.out.println(ds.sumOfDigits(38364));  //24
    }

}
