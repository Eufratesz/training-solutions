package week04d02;

public class SumAlgorithm {

    public int sumOfArray(int[] arr) {

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
