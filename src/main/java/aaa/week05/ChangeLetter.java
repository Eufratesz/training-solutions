package aaa.week05;

/*
A ChangeLetter osztályban írj meg egy String changeVowels(String) metódust, mely kicseréli a paraméterként átadott
szövegben az angol magánhangzókat csillag (*) karakterre.
 */



public class ChangeLetter {


//    public static final char[] WOWELCHARS= {'a', 'e', 'i', 'o', 'u'};

    public static final String VOWELS = "aeiou";

    public String changeVowels(String text) {
        text = text.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for(int i =0 ; i < text.length(); i++){
            String s = text.substring(i, i+1);
            if(VOWELS.contains(s)){
                sb.append("*");
            }
            else{
                sb.append(s);
            }
        }
        return sb.toString();
    }

//    public String changeVowels2(String text){
//        for (char c : WOWELCHARS){
//            text = text.replace(c, '*');            }
//            return text;
//        }
//
//    }
}
