package extrapractice.array;


import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
//
//        String[] daysOfTheWeek = {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
//        System.out.println(daysOfTheWeek[1]);
//        System.out.println(daysOfTheWeek.length);
//
//
//        int[] hatvanyok = new int[5];
//        hatvanyok[0] = 1;
//        for(int i=1; i< hatvanyok.length; i++) {
//            hatvanyok[i] = hatvanyok [i-1] * 2;
//            System.out.print(hatvanyok[i] + " ");
//            System.out.println();
//        }
//        for (int i =0; i < hatvanyok.length; i++){
//            System.out.print(hatvanyok[i]+ " ");
//        }


    boolean[] b = new boolean[6];
    for(int i = 1; i< b.length; i++) {
       b[i] = !b[i-1];
    }
    for(int i =0; i< b.length; i++) {
        System.out.println(b[i]+ " ");
    }

}
}
