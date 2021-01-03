package training.enumtype;

public class CoinMain {

    public static void main(String[] args) {
        Coin c = Coin.HUNDRED;

        for (Coin i : Coin.values()) {              // enum bejárása
            System.out.println(i);
        }

        System.out.println(c.ordinal());        //index lekérdezése
        System.out.println(c.name());               //Stringként kapjuk vissza az enum nevét


        Coin c2 = Coin.valueOf("FIVE");                         //Stringből enumot gyártunk.
        System.out.println(c2);


        System.out.println(c2.getValue());
    }
}
