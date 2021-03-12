package extrapractice.introcontrol;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        System.out.println("Adjon meg 5 számot!");

        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("adja meg az első számot!");
//        int number1= scanner.nextInt();
//        System.out.println("adja meg a második számot!");
//        int number2= scanner.nextInt();
//        System.out.println("adja meg a harmadik számot!");
//        int number3= scanner.nextInt();
//        System.out.println("adja meg a negyedik számot!");
//        int number4= scanner.nextInt();
//        System.out.println("adja meg az ötödik számot!");
//        int number5= scanner.nextInt();
//
//        int sum = number1 + number2 + number3 + number4 + number5;
//        System.out.println(sum);



        int sum = 0;
        for (int i =1; i<=5; i++){
            System.out.println("Adja meg a "+ i +". számot!");
            int number = scanner.nextInt();
            sum += number;
        }
        System.out.println(sum);


    }
}
