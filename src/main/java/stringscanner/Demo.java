package stringscanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner =new Scanner("aaa bbb ccc ddd");
        if(scanner.hasNext()){
            String w = scanner.next();
            System.out.println(w);
        }

        while(scanner.hasNext()){
            List<String> l = new ArrayList<>();
            l.add(scanner.next());
            System.out.println(l);
        }

        Scanner t = new Scanner("12 13 14");
        List<Integer>m = new ArrayList<>();
        while(t.hasNextInt()){
            m.add(t.nextInt());
            System.out.println(m);
        }

        Scanner scanner2 =new Scanner("aaa,bbb,ccc,ddd").useDelimiter(",");
        while(scanner2.hasNext()){
            System.out.println(scanner2.next());
        }

    }
}
