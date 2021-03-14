package extrapractice.controlselection;

public class WithoutAccent {

    public static final String WITHOUT_ACCENT = "aeioööüAEIOÖUÜ";

    public static final String WITH_ACCENT = "áéíóőúűÁÉÍÓŐÚŰ";

    public char changeAccent(char c) {
        int index = WITH_ACCENT.indexOf(c);

        if (index >= 0) {

            return WITHOUT_ACCENT.charAt(index);
        } else {
            return c;
        }
    }
}
