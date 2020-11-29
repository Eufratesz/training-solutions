package week05d02;

public class ChangeLetterMain {


    public static void main(String[] args) {
        ChangeLetter cl = new ChangeLetter();

        String result = cl.changeVowels2("arvizturotukorfurogep");
        System.out.println(result);


        String result2 = cl.changeVowels("arvizturotukorfurogep");
        System.out.println(result2);
    }
}
