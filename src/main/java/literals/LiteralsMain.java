package literals;

public class LiteralsMain {

    public static void main(String[] args) {


        //Összefűzés:
        System.out.println(1 + " " + 2);
        System.out.println(Integer.toString(1) + Integer.toString(2));

        //Osztás:
        double quotient = 3/4;
        System.out.println(quotient);  //0.0

        double quotient2 = 3/4d;
        System.out.println(quotient2);  //0.75

        //Nagy szám:
        long big = 3_2444_444_444L;
        System.out.println(big);

        //Karakterkódolás:
        String s = "árvíztűrőkükörfúrógép";
        System.out.println(s);

        //String mint objektum:
        String word = "title".toUpperCase();
        System.out.println(word);

        //Szám bináris stringként:

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));

    }
}
