package localvariables;

public class LocalVariablesMain {

    public static void main(String[] args) {
        boolean b;
       // System.out.println(b);  Nem lehet kiírni az értékét.

        b = false;
        System.out.println(b);

       // System.out.println(a);  definiálás előtt nem lehet kiírni.

        int a = 2;
        int i =3; int j = 4;
        int k = i;

        String s = "Hello Wold!";
        String t = s;
        System.out.println(s);
        System.out.println(t);

        {
            int x = 0;
            System.out.println(a);  // a blokk előtt definiált 'a' értékét.
        }
 //       System.out.println(x); blokkon kívül nem lehet kiírni.
    }



}
