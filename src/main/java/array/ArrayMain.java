package array;

public class ArrayMain {
    public static void main(String[] args) {

        String daysOfTheWeek[] = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(daysOfTheWeek[1]);
        System.out.println(daysOfTheWeek.length);


        int power[] = {1, 2, 4, 8, 16};
        for(int i = 0; i< power.length; i++) {
            System.out.println(power [i]);
        }

        for(int item: power) {
            System.out.println(item);
        }



        boolean b[] = {false, true, false, true, false, true};
        for(int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }


        for(boolean item: b) {
            System.out.println(item);
        }





    }
}
