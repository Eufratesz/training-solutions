package training.initializer;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {

    public static final Set<Integer> numbers;

    static {
        Set<Integer> draws =new TreeSet<>();
        Random rnd = new Random();
        while ( draws.size() < 5) {
            draws.add(rnd.nextInt(90)+1);
        }
        numbers = draws;
    }

    public static void main(String[] args) {
        System.out.println(numbers);

    }


}
