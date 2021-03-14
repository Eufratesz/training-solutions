package extrapractice.controlselection;

public class ToConsonant {

    public final String VOWELS = "aeiouAEIOU";

    public char nextConsonant(char c) {

        if (VOWELS.indexOf(c) >= 0) {
            return (char)(c+1);
        }
        else{
            return c;
        }

    }
}
