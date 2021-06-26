package aaa.week08;
/*
A week08d05 csomagban készíts egy osztályt MathAlgorithms néven. Legyen benne egy metódus, greatestCommonDivisor(), ami
 paraméterül vár két pozitív egész számot és visszaadja a legnagyobb közös osztójukat.
 */

import java.util.ArrayList;
import java.util.List;

public class MathAlgorithms {

    //megkeresem a közös listában a legnagyobbat, ehhez privát metódusban összegyűjtöm a közös osztókat:

    public int greatestCommonDivisor(int a, int b){
        List<Integer> divisors = getCommonDivisor(a, b);

        int greatest= divisors.get(0);
        for(int i =1; i < divisors.size(); i++){
            if(divisors.get(i) > greatest){
                greatest = divisors.get(i);
            }
        }
        return greatest;
    }


//Listába gyűjti a közös osztókat:
    private List<Integer> getCommonDivisor(int a, int b) {

        List<Integer> result = new ArrayList<>();

        for(int i = 1; i<= a; i++){
            if(a%i ==0 && b % i ==0){
                result.add(i);
            }
        }
        return result;
    }
}
