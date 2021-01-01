package arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysMain {


        public String numberOfDaysAsString() {
            int[] numberOfDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            return Arrays.toString(numberOfDays);

        }

        public List<String>daysOfWeek() {
            String []daysOfWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
            return Arrays.asList(daysOfWeek);

        }

        public String multiplicationTableAsString(int size) {
            int[][] table = new int[size][size];
            for (int i=0; i< size; i++) {
                for (int j=0; j < size; j++) {
                    table[i][j] = (i+1)*(j+1);
                }
            }
            return Arrays.deepToString(table);

        }

        public boolean sameTempValues(double[]day, double[]anotherDay) {
            return Arrays.equals(day, anotherDay);
        }

        public boolean wonLottery(int[]playedNumbers, int[]winningNumbers) {
            int[]copyOfPlayedNumbers = Arrays.copyOf(playedNumbers, playedNumbers.length);
            int[]copyOfWinningNumbers = Arrays.copyOf(winningNumbers, winningNumbers.length);
            Arrays.sort(copyOfPlayedNumbers);
            Arrays.sort(copyOfWinningNumbers);
            return Arrays.equals(copyOfPlayedNumbers, copyOfWinningNumbers);
        }

    public static void main(String[] args) {
        ArraysMain arraysMain = new ArraysMain();

        System.out.println(arraysMain.numberOfDaysAsString());
        System.out.println(arraysMain.daysOfWeek());
        System.out.println(arraysMain.multiplicationTableAsString(4));

        System.out.println(arraysMain.sameTempValues(new double[] {1, 2, 3}, new double[] {1, 2, 3}));
        System.out.println(arraysMain.sameTempValues(new double[] {1, 2, 3}, new double[] {2, 2, 3}));

        System.out.println(arraysMain.sameTempValues(new double[] {1,2, 3}, new double[] {1,2,3}));
        System.out.println(arraysMain.sameTempValues(new double[] {1,3}, new double[] {1,2,3}));

        int[] playedNumbers = new int[]{11, 13, 16, 20, 46};
        int[] winningNumbers = new int[]{20, 13, 46, 11, 16};
        System.out.println(arraysMain.wonLottery(playedNumbers, winningNumbers));
        System.out.println(Arrays.toString(winningNumbers));

        System.out.println(arraysMain.wonLottery(new int[] {11, 13, 16, 20, 46}, new int[]{21, 13, 46, 11, 16}));

    }
}

