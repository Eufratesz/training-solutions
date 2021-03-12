package extrapractice.introcontrol;

import java.util.Random;

public class Demo {

    public static void main(String[] args) {

        int x = new Random().nextInt(1000);

        if( x % 2==0){
            System.out.println("even: " + x);
        }else{
            System.out.println("odd: " + x);
        }
    }
}
