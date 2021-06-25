package aaa.week06;
/*
A WordEraser osztályban legyen egy eraseWord(String words, String word) metódus, mely az első paraméter szöveget úgy
változtatja meg, hogy a második paraméter összes előforulását kitörli belőle. A words paraméterben a szavak szóközzel
vannak elválasztva. A metódus térjen vissza a törölni kívánt szavak nélküli Stringgel. (Mellőzzük a replace és
replaceAll használatát!)
        */

public class WordEraser {

    public String eraseWord(String words, String word) {
        StringBuilder sb = new StringBuilder();

        String[] split = words.split(" ");
        for (String s : split) {
            if (!s.equals(word) ) {
                sb.append(s).append(" ");
            }
        }
        return sb.toString().trim();
    }

}

