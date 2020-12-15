/*
Mai Junior/Mid-level feladat:
Készíts a week08d02 csomagban egy Lottery osztályt, melynek legyen egy getNumbers(int interval, int numbers) metódusa,
ami visszaad egy listát amiben numbers mennyiségű véletlen szám van 1-interval között, tehát kvázi készíts egy
lottósorsoló programot. A sorrendre nem kell figyelni, a lényeg, hogy a számok különbözők legyenek!
 */

package week08d02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lottery {

    public List<Integer>getNumbers(int interval, int numbers, int seed) {


        List<Integer> winningNumbers = new ArrayList<>();

        Random random = new Random(5);

        int i = 1;
        while (winningNumbers.size() < numbers) {
            int number = random.nextInt(interval) + 1;
            if (!winningNumbers.contains(number)) {
                winningNumbers.add(number);
                i++;
            }
        }
            return winningNumbers;
    }




    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getNumbers(90,5, 5));
    }









}
