package aaa.week08;

/*
Készíts a week08d02 csomagban egy Lottery osztályt, melynek legyen egy getNumbers() metódusa, ami visszaad egy listát
amiben 5 véletlen szám van 1-90 között, tehát kvázi készíts egy lottósorsoló programot. A sorrendre nem kell figyelni,
a lényeg, hogy a számok különbözők legyenek!
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lottery {

//    public static final int NUMBER_OF_WINNING_NUMBERS = 5;
//    public static final int ALL_THE_NUMBERS = 90;

    public List<Integer> getNumbers() {

        List<Integer> winningNumbers = new ArrayList<>(5);

        for (int i = 0; i < 5; i++) {

            winningNumbers.add(generateNumberNotInList(winningNumbers));
        }
        return winningNumbers;
    }

    private Integer generateNumberNotInList(List<Integer> myList) {
        Random random = new Random();  //Teszteléshez a seed-et kell megadni.
        int number = random.nextInt(90) + 1;
        while (myList.contains(number)) {
            number = random.nextInt(90) + 1;
        }
        return number;
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        System.out.println(lottery.getNumbers());

    }
}
