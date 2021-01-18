/*
Adott az aktuális könyvtárban több fájl, melynek a nevei: number00.txt, number03.txt, number20.txt, egészen 99-ig.
Nem minden fájl létezik, lehet, hogy bizonyos számhoz tartozó fájl kimaradt. Olvasd be az állományból a benne lévő
számot, és ezt összegezd! Használd a Files.isRegularFile() metódust arra, hogy megnézd, létezik-e a fájl!
Használd a Files.readString() metódust a fájl beolvasására! A FilesSum osztály int sumNumbers()
metódusába dolgozz!
 */

package week11d04;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileSum {

    public int readFile(String name) {
        Path path = Path.of(name);

        try {
            String content = Files.readString(Path.of(name));
            int number = Integer.parseInt(content);
            return number;
        } catch (IOException e) {
            throw new IllegalStateException("Cannot find file");
        }
    }
/*
    public int sumNubers() {
        int sum =0;
        for (int i = 0; i < 100; i++) {
            //String filename = "number" + (i<10? "0"+i : i) +".txt";

            String filename;
            if(i<10) {
                filename = "number0" + i + ".txt";
            }else {
                filename = "number" + i + ".txt";
            }
            System.out.println(filename);
        }
        return 0;
    }

 */



        public int sumNumbers () {
            int sum = 0;
            for (int i = 0; i < 100; i++) {
                String filename = String.format("number%02d.txt", i);
                System.out.println(filename);

                if (Files.isRegularFile(Path.of(filename))) {
                    int number = readFile(filename);
                    sum += number;
                }
            }
            return sum;
        }

    public static void main(String[] args) {
        System.out.println(new FileSum().sumNumbers());

    }

    }




