package extrapractice.array;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {

    public String numberOfDays() {
        int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return Arrays.toString(numberOfDays);
    }

    public List<String> daysOfTheWeek() {
        return Arrays.asList("hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap");
    }

    public String multiplicationTableAsString(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; i < size; i++) {
                table[i][j] = (i + 1) * (j + 1);
            }

        }
        return Arrays.deepToString(table);
    }

    public boolean sameTempValues(double[] day, double[] anotherDay) {
        return Arrays.equals(day, anotherDay);
    }

    public boolean wonLottery(int[] one, int[] two) {
        int[] copyOfOne = Arrays.copyOf(one, one.length);
        int[] copyOfTwo = Arrays.copyOf(two, two.length);
        Arrays.sort(copyOfOne);
        Arrays.sort(copyOfTwo);
        return Arrays.equals(copyOfOne, copyOfTwo);

    }


    public static void main(String[] args) {
        ArraysMain am = new ArraysMain();

        System.out.println(am.numberOfDays());
        System.out.println(am.daysOfTheWeek());
        System.out.println(am.multiplicationTableAsString(4));

        System.out.println(am.sameTempValues(new double[]{1, 2}, new double[]{1, 2}));
        System.out.println(am.sameTempValues(new double[]{1, 2}, new double[]{3, 2}));

        System.out.println(am.wonLottery(new int[]{8, 7, 6, 5, 4, 3}, new int[]{7, 8, 3, 5, 4, 6}));
        System.out.println(am.wonLottery(new int[]{8, 7, 6, 5, 4, 3}, new int[]{9, 8, 3, 5, 4, 2}));
    }


}
