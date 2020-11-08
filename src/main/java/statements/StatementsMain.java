package statements;



public class StatementsMain {
    public static void main(String[] args) {

        int x = (5 + 6);
        System.out.println(x);

        int y = 11 - x;
        System.out.println(y);

        int z = 8;

        /*látom, túlbonyolítottam.
        boolean b;
        if (b x > y) {
            System.out.println(true);
        }
        System.out.println(false);

        boolean c;
        if b == true || z > 5) {
            System.out.println(true);
        }
        System.out.println(false);

         */
        //megoldókulcsot megnéztem, majd fejből újra.

        boolean b = x > y;
        boolean c = b || (z > 5);
        z++;
        System.out.println(b);
        System.out.println(c);
        System.out.println(z);
        //működik:)







    }
}
