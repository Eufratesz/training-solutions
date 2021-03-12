package training.array;

import java.util.Arrays;

public class ArrayMain {

    public static void main(String[] args) {
//        int[] a = new int[3];
//        a[0] = 1;
//        System.out.println(a[0]);
//        System.out.println(a[1]);
//
//        System.out.println(a.length);
//
//
//
//        int[]b = {1, 2, 3};
//
//        for (int i=0; i < b.length; i++) {
//            System.out.println(b[i]);
//        }
////for each loop:
//        for (int item: b) {
//            System.out.println(item);
//        }
//


        String[] fruits = {"apple", "peach", "plum", "orange", "pineapple", "banana"};
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        String[] favouriteFruits = new String[2];
        System.arraycopy(fruits, 1, favouriteFruits, 0, 2);
        System.out.println(Arrays.asList(favouriteFruits));

        String[] myFavourites = new String [4];
        System.arraycopy(fruits, 2, myFavourites, 0, 4);
        System.out.println(Arrays.asList(myFavourites));






    }
}
