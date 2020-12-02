
package week06d03;


import java.util.Scanner;

public class WordEraser {

    public String eraseWord(String words, String word) {
        String[] temp = words.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : temp) {
            if (!s.equals(word)) {
                sb.append(s + " ");
            }
        }
        return sb.toString().trim();
    }



    public String eraseWordsWithScanner(String words, String word) {
        Scanner scanner = new Scanner(words);
        StringBuilder result = new StringBuilder();

        while (scanner.hasNext()) {
            String s =scanner.next();
            if (!word.equals(s)) {
                result.append(s).append(" ");
            }
        }
        return result.toString().trim();
    }
}


/*
    Mai Junior/Mid-level feladat. A week06d03.WordEraser osztályban legyen egy eraseWord(String words, String word)
        metódus, mely az első paraméter szöveget úgy változtatja meg, hogy a második paraméter összes előforulását
        kitörli belőle. A words paraméterben a szavak szóközzel vannak elválasztva.
        A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel.
        (Mellőzzük a replace és replaceAll használatát)
*/