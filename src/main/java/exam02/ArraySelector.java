/*Írj egy olyan metódust az ArraySelector osztályban, mely egy kapott tömbből minden második elemet kiválogat,
és egy szövegként összerak, szögletes zárójelek között!

A páros megállapítása index szerint működik. Azaz az első, nulla indexű elem páros, a második, azaz egyes indexű elem
páratlan, stb. Ha nulla elemű a tömb, akkor üres stringet adjon vissza!

 */
package exam02;

public class ArraySelector {

    private int[]arrayOfNumbers;

    public String selectEvens(int[] ArrayOfNumbers) {
        int found= 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
           if(arrayOfNumbers.get(i % 2 ?  :  )

        }
        return "[" + found + "]";

    }

}
