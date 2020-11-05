package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] daysOfTheWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        System.out.println(daysOfTheWeek[1]);
        System.out.println(daysOfTheWeek.length);

        System.out.println();


        int[] powers = new int[5];
        powers[0] = 1;          //az első elemet beállítom 1-nek.

        for (int i = 1; i < powers.length; i++) {
            powers[i] = powers[i - 1] * 2;
        }

        for (int i = 0; i < powers.length; i++) {
            System.out.println(powers[i] + " ");
        }

        System.out.println();


        boolean[] boo = new boolean[6];

        for (int i = 1; i < boo.length; i++) {
            boo[i] = !boo[i - 1];
        }

        for (int i = 0; i < boo.length; i++) {
            System.out.println(boo[i] + " ");
        }

    }












}
