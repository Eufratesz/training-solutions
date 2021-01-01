package debug.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberStatistics {

    List<Integer> numbers = new ArrayList<>();

    public NumberStatistics(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public int sumPositives() {         //itt megtaláltam a hibát.
        int sum = 0;
        for(int n: numbers) {
            if( n > 0) {
                sum += n;
            }
        }
        return sum;
    }

    public int minDifferenceBetweenNeighbours() {           // ennél nem találtam meg a hibát.
        if (numbers.size() < 2 ) {
            throw new IllegalStateException("Not enough numbers");
        }
        int minDifference = numbers.get(0) - numbers.get(1) >= 0 ? numbers.get(0) - numbers.get(1) : numbers.get(1) - numbers.get(0);
        for (int i =1; i < numbers.size(); i++) {
            int actDifference = numbers.get(i) - numbers.get(i+1) >= 0 ? numbers.get(i) - numbers.get(i+1) : numbers.get(1+1) - numbers.get(i);
            if(actDifference < minDifference) {
                minDifference = actDifference;
            }
        }
        return minDifference;
    }

    public static void main(String[] args) {
        NumberStatistics numberStatistics = new NumberStatistics(Arrays.asList(3, 4, 5, 6, -1, 0));
        int sum = numberStatistics.sumPositives();
        int minDifference = numberStatistics.minDifferenceBetweenNeighbours();      //A 2. metódusnál segítség kellett.

        System.out.println("Sum: " + sum);
        System.out.println("Minimal Difference between neighbours: " + minDifference);

        NumberStatistics numberStatistics2 = new NumberStatistics(Arrays.asList(-3,-4));
        int sum2 = numberStatistics2.sumPositives();
        System.out.println("Sum2: " +sum2);

        NumberStatistics numberStatistics3 = new NumberStatistics(Arrays.asList(1));
        numberStatistics3.minDifferenceBetweenNeighbours(); // should throw IllegalStateException

    }
}
