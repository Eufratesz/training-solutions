package algorithmssum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSumCalculator {

    public int sum(List<Integer> numbers) {
        int sum = 0;
        for(Integer n: numbers){
            sum += n;
        }
        return sum;
    }
//Tesztelés:
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(37,98,13,847));
        IntegerSumCalculator calculator = new IntegerSumCalculator();
        System.out.println(calculator.sum(numbers));
    }
}
