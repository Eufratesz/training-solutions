package training.primitivetypes;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveTypesMain {

    public static void main(String[] args) {
        int i =9;

        Integer j = 9;

        List<Integer> numbers = new ArrayList<>();
        numbers.add(i);   //automatikusan Integerré konvertálja, meghívhatóak rá az Integer metódusai.

        System.out.println(Integer.toString(9, 2));
        System.out.println(Integer.toString(-9, 2));
        System.out.println(Integer.toBinaryString(-9));  // belső reprezentációt adja vissza

        int k = Integer.parseInt("");
        Integer l = new Integer ("9");

    }
}
