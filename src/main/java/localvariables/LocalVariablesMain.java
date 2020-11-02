package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b = false;
        System.out.println(b);

        int a = 2;
        int i = 3;
        int j = 4;
        int k = i;
        System.out.println(k);

        String s = "Hello World";
        String t = s;
        System.out.println(t);



         {
             int x = 0;
             System.out.println(x);
             System.out.println(a); // a blokk előtt definiált a-t kiírja, ha a blokkból íratom.
         };
     //   System.out.println(x); innen nem lehet, hibajel van.

    }
}
