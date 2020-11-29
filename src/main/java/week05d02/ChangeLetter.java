package week05d02;

public class ChangeLetter {

    public static final String VOWELS = "aeiou";                //1. megoldás
    public static final char[] VOWELS_CHAR = {'a', 'e', 'i', 'o', 'u'};      //2. megoldás

    public String changeVowels(String word) {
        word = word.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            String s = word.substring(i, i + 1);    //létrehehozza az s változót, hogy ne szerepeljen többször ugyanaz
            if (VOWELS.contains(s)) {
                stringBuilder.append("*");
            } else {
                stringBuilder.append(s);
            }
        }
        return stringBuilder.toString();
    }

    public String changeVowels2(String word) {
        for (char c : VOWELS_CHAR) {
                word =  word.replace(c,'*');
        }
        return word;
    }
}

