/*
unior/Mid level csoport mai gyakorlati feladata:
Készíts a week06d05 csomagban egy Biscuit nevű osztályt, amelynek van 2 attribútuma: BiscuitType type
és int gramAmount. A BiscuitType legyen felsorolásos típus a 3 kedvenc kekszfajtáddal. A Biscuit nevű osztálynak
legyen egy static metódusa of néven, mely paraméterként egy BiscuitType-ot, és egy int gramAmount-ot vár és
visszaad egy új Biscuit objektumot amelyet a megadott paraméterek alapján hoz létre.
Bónusz feladat: konzolra írás esetén a Biscuit jelenítse meg a type és a gramAmount mezőket!

 */

package week06d05;

public class Biscuit {
    private BiscuitType type;
    private int gramAmount;

    public Biscuit(BiscuitType type, int gramAmount) {
        if ( gramAmount < 0 ) {
            throw new IllegalArgumentException("Amount cannot be a negative number");
        }
        this.type = type;
        this.gramAmount = gramAmount;
    }


    public static Biscuit biscuitOf(BiscuitType type, int gramAmount) {
        return new Biscuit(type, gramAmount);
    }

    public static void main(String[] args) {
        System.out.println(new Biscuit (BiscuitType.OREO, 300));
        System.out.println(new Biscuit(BiscuitType.PILOTA_KEKSZ, 500));
        System.out.println(new Biscuit(BiscuitType.VANILIAS_KARIKA, 1000));

    }

}
